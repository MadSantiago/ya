package p000;

import android.content.SharedPreferences;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۦؘّؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4037 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC4367 f13463;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC4367 f13464;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3557 f13465;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13466;

    public /* synthetic */ C4037(C3557 c3557, InterfaceC4367 interfaceC4367, InterfaceC4367 interfaceC4368, int i) {
        this.f13466 = i;
        this.f13465 = c3557;
        this.f13463 = interfaceC4367;
        this.f13464 = interfaceC4368;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f13466;
        C2358 c2358 = C2358.f7817;
        InterfaceC4367 interfaceC4367 = this.f13464;
        InterfaceC4367 interfaceC4368 = this.f13463;
        C3557 c3557 = this.f13465;
        switch (i) {
            case 0:
                interfaceC4368.setValue(Boolean.FALSE);
                c3557.getClass();
                interfaceC4367.setValue(C3557.m6354());
                break;
            case 1:
                interfaceC4368.setValue(Boolean.FALSE);
                c3557.getClass();
                interfaceC4367.setValue(C3557.m6354());
                break;
            default:
                interfaceC4368.setValue(Boolean.FALSE);
                String str = ((C5745) interfaceC4367.getValue()).f18944.f4307;
                if (str.length() == 0 || Long.parseLong(str) < 1000) {
                    c3557.getClass();
                    interfaceC4367.setValue(C3557.m6354());
                } else {
                    c3557.getClass();
                    App app = App.f407;
                    C1443 c1443 = AbstractC2776.m5217().f410;
                    c1443.getClass();
                    C2518 c2518 = new C2518(c1443);
                    c2518.m4661(Long.valueOf(Long.parseLong(str)), AbstractC2539.f8449.f5219);
                    SharedPreferences.Editor editor = c2518.f8351;
                    if (editor != null) {
                        editor.apply();
                    }
                    if (!C1443.f4940 && !c1443.f4943) {
                        try {
                            AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                        } catch (Throwable unused) {
                        }
                    }
                }
                break;
        }
        return c2358;
    }
}
