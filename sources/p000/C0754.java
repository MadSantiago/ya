package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۥؙٟؗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0754 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public Object f2737;

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f2738;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f2739;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2740;

    public C0754(C4657 c4657) {
        this.f2740 = 2;
        this.f2738 = c4657;
        this.f2739 = -1;
        this.f2737 = AbstractC0949.m1924(new C1562(c4657, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2740) {
            case 0:
                if (this.f2739 < 0) {
                    m1641();
                }
                return this.f2739 == 1;
            case 1:
                return ((C0156) this.f2737).hasNext();
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0156) this.f2737).hasNext();
            default:
                return this.f2739 < ((Map) this.f2738).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.f2740) {
            case 0:
                if (this.f2739 < 0) {
                    m1641();
                }
                if (this.f2739 == 0) {
                    C0178.m381();
                    return null;
                }
                Object obj2 = this.f2737;
                this.f2739 = -1;
                return obj2;
            case 1:
                return ((C0156) this.f2737).next();
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0156) this.f2737).next();
            default:
                if (hasNext()) {
                    obj = this.f2737;
                    this.f2739++;
                    Object obj3 = ((Map) this.f2738).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.f2737 = ((C0167) obj3).f626;
                } else {
                    C0178.m381();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f2740;
        Object obj = this.f2738;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.f2739;
                if (i2 != -1) {
                    ((C5901) obj).f19454.m2479(i2);
                    this.f2739 = -1;
                    return;
                }
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                int i3 = this.f2739;
                if (i3 != -1) {
                    ((C4657) obj).f15353.m6498(i3);
                    this.f2739 = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m1641() {
        int i = this.f2739;
        C3306 c3306 = (C3306) this.f2738;
        Object objMo449 = i == -2 ? ((InterfaceC4448) c3306.f11069).mo449() : ((InterfaceC4745) c3306.f11068).mo211(this.f2737);
        this.f2737 = objMo449;
        this.f2739 = objMo449 == null ? 0 : 1;
    }

    public C0754(C3306 c3306) {
        this.f2740 = 0;
        this.f2738 = c3306;
        this.f2739 = -2;
    }

    public C0754(Object obj, Map map) {
        this.f2740 = 3;
        this.f2737 = obj;
        this.f2738 = map;
    }

    public C0754(C5901 c5901) {
        this.f2740 = 1;
        this.f2738 = c5901;
        this.f2739 = -1;
        this.f2737 = AbstractC0949.m1924(new C5187(c5901, this, null));
    }
}
