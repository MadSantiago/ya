package p000;

/* JADX INFO: renamed from: ۥۣۣؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2653 extends AbstractC4623 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f8805;

    /* JADX INFO: renamed from: ۥۗ */
    public String f8806;

    /* JADX INFO: renamed from: ۥۣ */
    public C0381[] f8807;

    public AbstractC2653(AbstractC2653 abstractC2653) {
        this.f8807 = null;
        this.f8805 = 0;
        this.f8806 = abstractC2653.f8806;
        C0381[] c0381Arr = abstractC2653.f8807;
        C0381[] c0381Arr2 = new C0381[c0381Arr.length];
        for (int i = 0; i < c0381Arr.length; i++) {
            c0381Arr2[i] = new C0381(c0381Arr[i]);
        }
        this.f8807 = c0381Arr2;
    }

    public C0381[] getPathData() {
        return this.f8807;
    }

    public String getPathName() {
        return this.f8806;
    }

    public void setPathData(C0381[] c0381Arr) {
        C0381[] c0381Arr2 = this.f8807;
        if (c0381Arr2 != null && c0381Arr != null && c0381Arr2.length == c0381Arr.length) {
            int i = 0;
            while (true) {
                if (i >= c0381Arr2.length) {
                    C0381[] c0381Arr3 = this.f8807;
                    for (int i2 = 0; i2 < c0381Arr.length; i2++) {
                        c0381Arr3[i2].f1421 = c0381Arr[i2].f1421;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = c0381Arr[i2].f1420;
                            if (i3 < fArr.length) {
                                c0381Arr3[i2].f1420[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                C0381 c0381 = c0381Arr2[i];
                char c = c0381.f1421;
                C0381 c0382 = c0381Arr[i];
                if (c != c0382.f1421 || c0381.f1420.length != c0382.f1420.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C0381[] c0381Arr4 = new C0381[c0381Arr.length];
        for (int i4 = 0; i4 < c0381Arr.length; i4++) {
            c0381Arr4[i4] = new C0381(c0381Arr[i4]);
        }
        this.f8807 = c0381Arr4;
    }

    public AbstractC2653() {
        this.f8807 = null;
        this.f8805 = 0;
    }
}
