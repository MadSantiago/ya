package p000;

import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؕؗؑۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3295 extends AbstractC1985 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C3295 f11034 = new C3295();

    /* JADX INFO: renamed from: ۥُ */
    public static final String f11032 = new C4441(new long[]{4586123848035552286L, 468098360309851352L, 6566023970532376663L, -1841005358185700307L}).toString();

    /* JADX INFO: renamed from: ۥّ */
    public static final int f11033 = R.string.hook_ad_related;

    @Override // p000.AbstractC3003
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo221() {
        Class clsM7247;
        String strM3887 = m3887();
        if (strM3887 == null || (clsM7247 = C4047.m7247(this, strM3887)) == null) {
            m3888(R.string.error_log_info5);
            return;
        }
        C3121 c3121M7158 = AbstractC4009.m7158(clsM7247);
        c3121M7158.m5746();
        C2244 c2244M5751 = c3121M7158.m5751();
        c2244M5751.f9027 = new C4441(new long[]{-3336051004591942269L, -8646719136366675761L, -5494504674764130805L}).toString();
        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244M5751.m4293());
        C3295 c3295 = f11034;
        if (c3657 != null) {
            C3751 c3751M7252 = c3295.m7252(c3657, 1);
            c3751M7252.m6592(null);
            c3751M7252.m6588();
        } else {
            c3295.m3888(R.string.error_log_info3);
        }
        C3121 c3121M7159 = AbstractC4009.m7158(clsM7247);
        c3121M7159.m5746();
        C2244 c2244M5752 = c3121M7159.m5751();
        c2244M5752.f9027 = new C4441(new long[]{7246493017201711429L, 6907214587612035349L, -7273850639785908326L}).toString();
        C3657 c3658 = (C3657) AbstractC0973.m2058(c2244M5752.m4293());
        if (c3658 != null) {
            C3751 c3751M7253 = c3295.m7252(c3658, 1);
            c3751M7253.m6592(null);
            c3751M7253.m6588();
        } else {
            c3295.m3888(R.string.error_log_info3);
        }
        C3121 c3121M71510 = AbstractC4009.m7158(clsM7247);
        c3121M71510.m5746();
        C2244 c2244M5753 = c3121M71510.m5751();
        c2244M5753.f9027 = new C4441(new long[]{6378922002297217378L, -8015941600257286021L, 1169661724357617248L}).toString();
        C3657 c3659 = (C3657) AbstractC0973.m2058(c2244M5753.m4293());
        if (c3659 == null) {
            c3295.m3888(R.string.error_log_info3);
            return;
        }
        C3751 c3751M7254 = c3295.m7252(c3659, 1);
        c3751M7254.m6595();
        c3751M7254.m6588();
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦِ */
    public final int mo222() {
        return f11033;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo223() {
        return f11032;
    }
}
