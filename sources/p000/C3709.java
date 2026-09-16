package p000;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: ۦٌؘؒٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3709 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥؓ */
    public static final C3709 f12356;

    /* JADX INFO: renamed from: ۥؖ */
    public static final C3709 f12357;

    /* JADX INFO: renamed from: ۥً */
    public static final C3709 f12358;

    /* JADX INFO: renamed from: ۥَ */
    public static final C3709 f12359;

    /* JADX INFO: renamed from: ۥْ */
    public static final C3709 f12360;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C3709 f12361;

    /* JADX INFO: renamed from: ۥٕ */
    public static final C3709 f12362;

    /* JADX INFO: renamed from: ۥٖ */
    public static final C3709 f12363;

    /* JADX INFO: renamed from: ۥٙ */
    public static final C3709 f12364;

    /* JADX INFO: renamed from: ۥۖ */
    public static final C3709 f12365;

    /* JADX INFO: renamed from: ۥۙ */
    public static final C3709 f12366;

    /* JADX INFO: renamed from: ۥۧ */
    public static final C3709 f12367;

    /* JADX INFO: renamed from: ۦٕ */
    public static final C3709 f12368;

    /* JADX INFO: renamed from: ۦٗ */
    public static final C3709 f12369;

    /* JADX INFO: renamed from: ۦٚ */
    public static final C3709 f12370;

    /* JADX INFO: renamed from: ۦۛ */
    public static final C3709 f12371;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f12372;

    static {
        int i = 0;
        f12360 = new C3709(i, 0);
        f12361 = new C3709(i, 1);
        f12359 = new C3709(i, 2);
        f12363 = new C3709(i, 3);
        f12369 = new C3709(i, 4);
        f12371 = new C3709(i, 5);
        f12365 = new C3709(i, 6);
        f12368 = new C3709(i, 7);
        f12364 = new C3709(i, 8);
        f12357 = new C3709(i, 9);
        f12356 = new C3709(i, 10);
        f12367 = new C3709(i, 11);
        f12358 = new C3709(i, 12);
        f12370 = new C3709(i, 13);
        f12362 = new C3709(i, 14);
        f12366 = new C3709(i, 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3709(int i, int i2) {
        super(i);
        this.f12372 = i2;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        switch (this.f12372) {
            case 0:
                AbstractC2853.m5417("LocalProvidableLocaleList");
                throw null;
            case 1:
                return Boolean.FALSE;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return null;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC2853.m5417("LocalTextToolbar");
                throw null;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                AbstractC2853.m5417("LocalUriHandler");
                throw null;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC2853.m5417("LocalViewConfiguration");
                throw null;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC2853.m5417("LocalWindowInfo");
                throw null;
            case 8:
                return Boolean.TRUE;
            case 9:
                return Boolean.FALSE;
            case 10:
                return new C2561();
            case 11:
                return new C0605(3);
            case 12:
                return new C1706(new PathMeasure());
            case 13:
            case 14:
                return null;
            default:
                return C2358.f7817;
        }
    }
}
