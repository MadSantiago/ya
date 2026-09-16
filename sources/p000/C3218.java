package p000;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;

/* JADX INFO: renamed from: ۦٟؔؓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3218 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥؓ */
    public static final C3218 f10773;

    /* JADX INFO: renamed from: ۥؔ */
    public static final C3218 f10774;

    /* JADX INFO: renamed from: ۥؖ */
    public static final C3218 f10775;

    /* JADX INFO: renamed from: ۥً */
    public static final C3218 f10776;

    /* JADX INFO: renamed from: ۥَ */
    public static final C3218 f10777;

    /* JADX INFO: renamed from: ۥْ */
    public static final C3218 f10778;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C3218 f10779;

    /* JADX INFO: renamed from: ۥٕ */
    public static final C3218 f10780;

    /* JADX INFO: renamed from: ۥٖ */
    public static final C3218 f10781;

    /* JADX INFO: renamed from: ۥ٘ */
    public static final C3218 f10782;

    /* JADX INFO: renamed from: ۥٙ */
    public static final C3218 f10783;

    /* JADX INFO: renamed from: ۥٛ */
    public static final C3218 f10784;

    /* JADX INFO: renamed from: ۥٝ */
    public static final C3218 f10785;

    /* JADX INFO: renamed from: ۥۖ */
    public static final C3218 f10786;

    /* JADX INFO: renamed from: ۥۙ */
    public static final C3218 f10787;

    /* JADX INFO: renamed from: ۥۤ */
    public static final C3218 f10788;

    /* JADX INFO: renamed from: ۥۦ */
    public static final C3218 f10789;

    /* JADX INFO: renamed from: ۥۧ */
    public static final C3218 f10790;

    /* JADX INFO: renamed from: ۦؒ */
    public static final C3218 f10791;

    /* JADX INFO: renamed from: ۦؖ */
    public static final C3218 f10792;

    /* JADX INFO: renamed from: ۦؗ */
    public static final C3218 f10793;

    /* JADX INFO: renamed from: ۦؙ */
    public static final C3218 f10794;

    /* JADX INFO: renamed from: ۦُ */
    public static final C3218 f10795;

    /* JADX INFO: renamed from: ۦٕ */
    public static final C3218 f10796;

    /* JADX INFO: renamed from: ۦٖ */
    public static final C3218 f10797;

    /* JADX INFO: renamed from: ۦٗ */
    public static final C3218 f10798;

    /* JADX INFO: renamed from: ۦٚ */
    public static final C3218 f10799;

    /* JADX INFO: renamed from: ۦۛ */
    public static final C3218 f10800;

    /* JADX INFO: renamed from: ۦۜ */
    public static final C3218 f10801;

    /* JADX INFO: renamed from: ۦۣ */
    public static final C3218 f10802;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f10803;

    static {
        int i = 0;
        f10778 = new C3218(i, 0);
        f10779 = new C3218(i, 1);
        f10777 = new C3218(i, 2);
        f10781 = new C3218(i, 3);
        f10798 = new C3218(i, 4);
        f10800 = new C3218(i, 5);
        f10786 = new C3218(i, 6);
        f10796 = new C3218(i, 7);
        f10783 = new C3218(i, 8);
        f10775 = new C3218(i, 9);
        f10773 = new C3218(i, 10);
        f10790 = new C3218(i, 11);
        f10776 = new C3218(i, 12);
        f10799 = new C3218(i, 13);
        f10780 = new C3218(i, 14);
        f10787 = new C3218(i, 15);
        f10794 = new C3218(i, 16);
        f10792 = new C3218(i, 17);
        f10789 = new C3218(i, 18);
        f10793 = new C3218(i, 19);
        f10795 = new C3218(i, 20);
        f10797 = new C3218(i, 21);
        f10774 = new C3218(i, 22);
        f10801 = new C3218(i, 23);
        f10802 = new C3218(i, 24);
        f10782 = new C3218(i, 25);
        f10784 = new C3218(i, 26);
        f10788 = new C3218(i, 27);
        f10791 = new C3218(i, 28);
        f10785 = new C3218(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3218(int i, int i2) {
        super(i);
        this.f10803 = i2;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        Choreographer choreographer;
        int i = this.f10803;
        int i2 = 2;
        C2358 c2358 = C2358.f7817;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                AbstractC4354.m7644("LocalConfiguration");
                throw null;
            case 1:
                AbstractC4354.m7644("LocalContext");
                throw null;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC4354.m7644("LocalImageVectorCache");
                throw null;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC4354.m7644("LocalResourceIdCache");
                throw null;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC4354.m7644("LocalView");
                throw null;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return UUID.randomUUID();
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.FALSE;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    C0649 c0649 = AbstractC0912.f3276;
                    choreographer = (Choreographer) AbstractC5537.m9243(AbstractC5794.f19088, new C2499(i2, interfaceC0443, 0));
                }
                C5418 c5418 = new C5418(choreographer, AbstractC4554.m7893(Looper.getMainLooper()));
                return AbstractC4593.m7963(c5418, c5418.f17887);
            case 10:
            case 11:
            case 12:
                return c2358;
            case 13:
                return new C0605(2);
            case 14:
            case 15:
                return null;
            case 16:
                AbstractC2853.m5417("LocalAutofillManager");
                throw null;
            case 17:
                AbstractC2853.m5417("LocalAutofillTree");
                throw null;
            case 18:
                AbstractC2853.m5417("LocalClipboard");
                throw null;
            case 19:
                AbstractC2853.m5417("LocalClipboardManager");
                throw null;
            case 20:
                return Boolean.TRUE;
            case 21:
                AbstractC2853.m5417("LocalDensity");
                throw null;
            case 22:
                AbstractC2853.m5417("LocalFocusManager");
                throw null;
            case 23:
                AbstractC2853.m5417("LocalFontFamilyResolver");
                throw null;
            case 24:
                AbstractC2853.m5417("LocalFontLoader");
                throw null;
            case 25:
                AbstractC2853.m5417("LocalGraphicsContext");
                throw null;
            case 26:
                AbstractC2853.m5417("LocalHapticFeedback");
                throw null;
            case 27:
                AbstractC2853.m5417("LocalInputManager");
                throw null;
            case 28:
                AbstractC2853.m5417("LocalLayoutDirection");
                throw null;
            default:
                return null;
        }
    }
}
