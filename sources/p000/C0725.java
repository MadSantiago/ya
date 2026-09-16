package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥؙؔٛؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0725 extends AbstractC4821 {

    /* JADX INFO: renamed from: ۥَ */
    public final transient Object[] f2649;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient C5147 f2650;

    /* JADX INFO: renamed from: ۥٖ */
    public final transient int f2651;

    public C0725(C5147 c5147, Object[] objArr, int i) {
        this.f2650 = c5147;
        this.f2649 = objArr;
        this.f2651 = i;
    }

    @Override // p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f2650.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2651;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return true;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1603(Object[] objArr) {
        return mo4834().mo1603(objArr);
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0219 iterator() {
        return mo4834().listIterator(0);
    }

    @Override // p000.AbstractC4821
    /* JADX INFO: renamed from: ۦۚ */
    public final AbstractC4822 mo1605() {
        return new C0168(this);
    }
}
