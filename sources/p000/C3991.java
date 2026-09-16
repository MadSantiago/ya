package p000;

import java.io.File;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۦؘِؓۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3991 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2247 f13320;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13321;

    public /* synthetic */ C3991(C2247 c2247, int i) {
        this.f13321 = i;
        this.f13320 = c2247;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        Object value;
        Object value2;
        int i = this.f13321;
        C2358 c2358 = C2358.f7817;
        C2247 c2247 = this.f13320;
        switch (i) {
            case 0:
                C5648 c5648 = c2247.f7457;
                MainActivity mainActivity = MainActivity.f411;
                MainActivity mainActivityM9214 = AbstractC5537.m9214();
                if (c2247.f7454.m4259().isEmpty()) {
                    C5648.m9481(c5648, R.string.dialog_lspatch_message, 1);
                } else {
                    File file = new File(mainActivityM9214.getDataDir() + "/shared_prefs", new C4441(new long[]{-2574943572084681046L, 5595235916114443614L, 4524465044661142019L, 5129186676792220167L}).toString());
                    if (file.exists()) {
                        AbstractC2765.m5140(mainActivityM9214, new C1597(mainActivityM9214, file, c2247, 10));
                    } else {
                        C5648.m9481(c5648, R.string.dialog_lspatch_message2, 1);
                    }
                }
                return c2358;
            case 1:
                c2247.f7457.m9483(true);
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC2765.m5135(AbstractC2776.m5210(c2247), null, 0, new C0542(c2247, null, 2), 3);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C3161 c3161 = c2247.f7455;
                C4994 c4994 = c2247.f7457.f18601;
                do {
                    value = c4994.getValue();
                } while (!c4994.m8386(value, C1966.m3846((C1966) value, null, false, 0, false, false, null, false, false, false, 495)));
                final String str = ((C1966) c3161.f10642.getValue()).f6491;
                final boolean z = ((C1966) c3161.f10642.getValue()).f6497;
                App app = App.f407;
                AbstractC2776.m5217().f409.m3071(new InterfaceC4745() { // from class: ۦٕؑٙۗ
                    @Override // p000.InterfaceC4745
                    /* JADX INFO: renamed from: ۦؚ */
                    public final Object mo211(Object obj) {
                        C2518 c2518 = (C2518) obj;
                        c2518.m4661(str, AbstractC2539.f8462.f5219);
                        c2518.m4661(Boolean.valueOf(z), AbstractC2539.f8443.f5219);
                        return C2358.f7817;
                    }
                });
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C1966) c2247.f7455.f10642.getValue()).f6494 == EnumC5242.f17308 ? EnumC5242.f17306 : EnumC5242.f17307;
            default:
                C4994 c4995 = c2247.f7454.f7288;
                do {
                    value2 = c4995.getValue();
                } while (!c4995.m8386(value2, C5890.m9722((C5890) value2, false, C2340.f7777, 1)));
                return c2358;
        }
    }
}
