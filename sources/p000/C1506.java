package p000;

/* JADX INFO: renamed from: ۥٗؑ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1506 {

    /* JADX INFO: renamed from: ۥُ */
    public C1506 f5114;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f5115;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3833 f5116;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f5117;

    /* JADX INFO: renamed from: ۦؑ */
    public int f5118;

    /* JADX INFO: renamed from: ۥؗ */
    public int f5113 = -1;

    /* JADX INFO: renamed from: ۦۙ */
    public final C4852 f5119 = AbstractC2774.m5183(null);

    public C1506(Object obj, C3833 c3833) {
        this.f5117 = obj;
        this.f5116 = c3833;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3182() {
        if (this.f5115) {
            return;
        }
        if (this.f5118 <= 0) {
            AbstractC4690.m8035("Release should only be called once");
        }
        int i = this.f5118 - 1;
        this.f5118 = i;
        if (i == 0) {
            this.f5116.f12721.remove(this);
            C1506 c1506 = this.f5114;
            if (c1506 != null) {
                c1506.m3182();
            }
            this.f5114 = null;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1506 m3183() {
        if (this.f5115) {
            AbstractC4690.m8035("Pin should not be called on an already disposed item ");
        }
        if (this.f5118 == 0) {
            this.f5116.f12721.add(this);
            C1506 c1506 = (C1506) this.f5119.getValue();
            if (c1506 != null) {
                c1506.m3183();
            } else {
                c1506 = null;
            }
            this.f5114 = c1506;
        }
        this.f5118++;
        return this;
    }
}
