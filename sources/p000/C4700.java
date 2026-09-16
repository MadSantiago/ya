package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٜؖٔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4700 extends AbstractC4134 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C4700 f15502 = new C4700(1);

    /* JADX INFO: renamed from: ۥۜ */
    public static final String f15503;

    /* JADX INFO: renamed from: ۦٛ */
    public static final int f15504;

    /* JADX INFO: renamed from: ۦۙ */
    public static final String f15505;

    static {
        C0886 c0886 = EnumC3573.f11873;
        f15505 = c0886.f11896;
        f15503 = c0886.f11895;
        f15504 = c0886.f11893;
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo482() {
        m7322(new C0037(1, this, C4700.class, new C4441(new long[]{8398867566063009819L, 6353318888959092064L, 5945877413288489281L}).toString(), new C4441(new long[]{-1042561663044132058L, -5823995601094546377L, 3824347116145196616L, -2709799822203579649L, -1583967871837623701L, 114786866538462470L, -4156011696150732468L, -2433953795353780782L, -1835875108146895346L, 7845802169845160723L, -1121545149035468100L, -2544055440688765291L, 5447319814208189377L}).toString(), 0, 18));
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦؚ */
    public final String mo484() {
        return f15505;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦِ */
    public final int mo222() {
        return f15504;
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۦٗ */
    public final C2351 mo485() {
        C2351 c2351 = new C2351(0);
        C2672 c2672 = new C2672();
        C2672.m4975(c2672, new C4441(new long[]{8229702547712278655L, -5068825749276502804L, 6129877242611429336L, -5660178246046782780L, 4268157793098683698L}).toString(), 6);
        c2351.f7798 = c2672;
        return c2351;
    }

    @Override // p000.AbstractC1985
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo223() {
        return f15503;
    }

    @Override // p000.AbstractC4134
    /* JADX INFO: renamed from: ۦۛ */
    public final C2351 mo4011() {
        C2351 c2351 = new C2351(1);
        C0637 c0637 = new C0637();
        c0637.m1446(27);
        C5310 c5310 = new C5310();
        Class<List> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(List.class));
        Class cls = clsM9037 != null ? clsM9037 : List.class;
        C3098 c3098 = c5310.f17487;
        if (c3098 == null) {
            c3098 = new C3098();
        }
        c5310.f17487 = c3098;
        c3098.m5686(cls);
        c0637.m1443(c5310);
        c2351.f7798 = c0637;
        return c2351;
    }
}
