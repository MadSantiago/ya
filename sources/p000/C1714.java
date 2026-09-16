package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؘٜٚؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1714 {

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC2776 f5700;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3472 f5705;

    /* JADX INFO: renamed from: ۦٌ */
    public C3312 f5707;

    /* JADX INFO: renamed from: ۦِ */
    public final float f5708;

    /* JADX INFO: renamed from: ۦۚ */
    public float f5712;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f5713;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C1069 f5698 = new C1069(1);

    /* JADX INFO: renamed from: ۥْ */
    public static final C1069 f5694 = new C1069(2);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C1069 f5695 = new C1069(3);

    /* JADX INFO: renamed from: ۥَ */
    public static final C1069 f5693 = new C1069(4);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C1069 f5696 = new C1069(5);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C1069 f5697 = new C1069(0);

    /* JADX INFO: renamed from: ۥۣ */
    public float f5704 = 0.0f;

    /* JADX INFO: renamed from: ۥۗ */
    public float f5702 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f5699 = false;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f5701 = false;

    /* JADX INFO: renamed from: ۦۙ */
    public final float f5711 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۥۜ */
    public final float f5703 = -3.4028235E38f;

    /* JADX INFO: renamed from: ۦٛ */
    public long f5709 = 0;

    /* JADX INFO: renamed from: ۦۗ */
    public final ArrayList f5710 = new ArrayList();

    /* JADX INFO: renamed from: ۦؚ */
    public final ArrayList f5706 = new ArrayList();

    public C1714(C3472 c3472, AbstractC2776 abstractC2776) {
        this.f5705 = c3472;
        this.f5700 = abstractC2776;
        if (abstractC2776 == f5695 || abstractC2776 == f5693 || abstractC2776 == f5696) {
            this.f5708 = 0.1f;
        } else if (abstractC2776 == f5697) {
            this.f5708 = 0.00390625f;
        } else if (abstractC2776 == f5698 || abstractC2776 == f5694) {
            this.f5708 = 0.002f;
        } else {
            this.f5708 = 1.0f;
        }
        this.f5707 = null;
        this.f5712 = Float.MAX_VALUE;
        this.f5713 = false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3532(float f) {
        this.f5700.mo2268(this.f5705, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5706;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                AbstractC2304 abstractC2304 = (AbstractC2304) arrayList.get(i);
                float f2 = this.f5702;
                abstractC2304.getClass();
                Math.max(-1L, Math.min(0 + 1, Math.round(f2)));
                throw null;
            }
            i++;
        }
    }
}
