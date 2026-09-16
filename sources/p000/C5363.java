package p000;

import java.util.List;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦ۟ؗۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5363 extends AbstractC1985 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5363 f17691 = new C5363();

    /* JADX INFO: renamed from: ۥُ */
    public static final String f17689 = new C4441(new long[]{421167082019687058L, 6198545670254983448L, 7730569618304075655L, 8525838365578771282L}).toString();

    /* JADX INFO: renamed from: ۥّ */
    public static final int f17690 = R.string.hook_discovery_hints;

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
        c2244.f7439 = AbstractC5041.m8557(List.class);
        C3657 c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
        C5363 c5363 = f17691;
        if (c3657 == null) {
            c5363.m3888(R.string.error_log_info3);
            return;
        }
        C3751 c3751M7252 = c5363.m7252(c3657, 1);
        c3751M7252.m6592(C2340.f7777);
        c3751M7252.m6588();
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦِ */
    public final int mo222() {
        return f17690;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo223() {
        return f17689;
    }
}
