package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٖؐؔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2981 extends AbstractC1985 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2981 f10017 = new C2981();

    /* JADX INFO: renamed from: ۥُ */
    public static final String f10015 = new C4441(new long[]{-250732375490043348L, -5572507360997290681L, 5021943290702114510L}).toString();

    /* JADX INFO: renamed from: ۥّ */
    public static final int f10016 = R.string.hook_ad_placecard;

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
        c2244.f9027 = new C4441(new long[]{-2595671359774247624L, -552325972711420138L, 7069676907343937011L}).toString();
        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
        C2981 c2981 = f10017;
        if (c3657 == null) {
            c2981.m3888(R.string.error_log_info3);
            return;
        }
        C3751 c3751M7252 = c2981.m7252(c3657, 1);
        c3751M7252.m6592(null);
        c3751M7252.m6588();
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦِ */
    public final int mo222() {
        return f10016;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo223() {
        return f10015;
    }
}
