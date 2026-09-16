package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؐؔؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0122 extends AbstractC1985 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0122 f480 = new C0122();

    /* JADX INFO: renamed from: ۥُ */
    public static final String f478 = new C4441(new long[]{-8967232775049450865L, -2582653498037673217L, 3544381711145889788L}).toString();

    /* JADX INFO: renamed from: ۥّ */
    public static final int f479 = R.string.hook_refuel_data;

    @Override // p000.AbstractC3003
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo221() {
        Class clsM7247;
        String strM3887 = m3887();
        if (strM3887 == null || (clsM7247 = C4047.m7247(this, strM3887)) == null) {
            m3888(R.string.error_log_info5);
            return;
        }
        C4229 c4229 = new C4229(clsM7247, null, 1);
        c4229.f14028 = 3;
        C2244 c2244 = new C2244();
        c2244.f9028 = c4229;
        c2244.f9027 = new C4441(new long[]{-5365004982230803490L, 4539227563344169819L, -1034988660397524948L}).toString();
        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
        C0122 c0122 = f480;
        if (c3657 == null) {
            c0122.m3888(R.string.error_log_info3);
            return;
        }
        C3751 c3751M7252 = c0122.m7252(c3657, 1);
        c3751M7252.m6592(null);
        c3751M7252.m6588();
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦِ */
    public final int mo222() {
        return f479;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo223() {
        return f478;
    }
}
