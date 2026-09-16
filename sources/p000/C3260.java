package p000;

/* JADX INFO: renamed from: ۦؕؒؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3260 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f10937;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f10938;

    /* JADX INFO: renamed from: ۥۗ */
    public C2346 f10939;

    /* JADX INFO: renamed from: ۥۣ */
    public C2346 f10940;

    /* JADX INFO: renamed from: ۦؑ */
    public Long f10941;

    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m6014(C5745 c5745) {
        C2346 c2346;
        C5745 c5746;
        this.f10938 = false;
        C2346 c2347 = this.f10940;
        if (AbstractC3831.m6874(c5745, c2347 != null ? (C5745) c2347.f7785 : null)) {
            return;
        }
        String str = c5745.f18944.f4307;
        C2346 c2348 = this.f10940;
        boolean zM6874 = AbstractC3831.m6874(str, (c2348 == null || (c5746 = (C5745) c2348.f7785) == null) ? null : c5746.f18944.f4307);
        C2346 c2349 = this.f10940;
        if (zM6874) {
            if (c2349 != null) {
                c2349.f7785 = c5745;
                return;
            }
            return;
        }
        this.f10940 = new C2346(14, c2349, c5745);
        this.f10939 = null;
        int length = c5745.f18944.f4307.length() + this.f10937;
        this.f10937 = length;
        if (length > 100000) {
            C2346 c23410 = this.f10940;
            if ((c23410 != null ? (C2346) c23410.f7786 : null) == null) {
                return;
            }
            while (true) {
                if (c23410 == null) {
                    c2346 = null;
                } else {
                    C2346 c23411 = (C2346) c23410.f7786;
                    if (c23411 != null) {
                        c2346 = (C2346) c23411.f7786;
                    } else {
                        c2346 = null;
                    }
                }
                if (c2346 == null) {
                    break;
                } else {
                    c23410 = (C2346) c23410.f7786;
                }
            }
            if (c23410 != null) {
                c23410.f7786 = null;
            }
        }
    }
}
