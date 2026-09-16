package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦَُؔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3839 extends AbstractSet {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f12783;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12784;

    public /* synthetic */ C3839(int i, Object obj) {
        this.f12784 = i;
        this.f12783 = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.f12784;
        Object obj2 = this.f12783;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C1332) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C1789) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f12784;
        Object obj = this.f12783;
        switch (i) {
            case 1:
                ((C1332) obj).clear();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C1789) obj).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.f12784;
        Object obj2 = this.f12783;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((C1332) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 != value) {
                    return obj3 != null && obj3.equals(value);
                }
                return true;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((C1789) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 != value2) {
                    return obj4 != null && obj4.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.f12784;
        Object obj = this.f12783;
        switch (i) {
            case 0:
                return new C3739((C4461) obj);
            case 1:
                return new C2867((C1332) obj, 0);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C2867((C1789) obj, 1);
            default:
                return new C2692(this, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.f12784;
        Object obj2 = this.f12783;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C1332) obj2).remove(entry.getKey());
                return true;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C1789) obj2).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f12784;
        Object obj = this.f12783;
        switch (i) {
            case 0:
                return ((C4461) obj).f2862;
            case 1:
                return ((C1332) obj).size();
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C1789) obj).size();
            default:
                return ((C4387) obj).f14457;
        }
    }
}
