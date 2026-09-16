package p000;

import android.content.Intent;
import java.util.concurrent.ExecutorService;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;
import ru.bluecat.yandexmapspatcher.services.BackgroundJobService;

/* JADX INFO: renamed from: ۦؙٟؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3530 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5269 f11702;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11703;

    public /* synthetic */ C3530(C5269 c5269, int i) {
        this.f11703 = i;
        this.f11702 = c5269;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        Object value;
        int i = this.f11703;
        C2358 c2358 = C2358.f7817;
        int i2 = 0;
        C5269 c5269 = this.f11702;
        switch (i) {
            case 0:
                InterfaceC1897 interfaceC1897 = (InterfaceC1897) AbstractC5781.f19049.f6933;
                if (interfaceC1897 != null) {
                    interfaceC1897.mo161();
                } else {
                    String[] strArr = {new C4441(new long[]{1381279603497356804L, 8710888779138575240L, -4293349845388098868L, 5439526930977415725L, 65236200568220316L, -5279714407088054359L}).toString()};
                    ExecutorService executorService = C3267.f10970;
                    AbstractC2552.m4793(strArr).m7727();
                }
                MainActivity mainActivity = MainActivity.f411;
                AbstractC5537.m9214().finish();
                C4994 c4994 = c5269.f17363.f7288;
                do {
                    value = c4994.getValue();
                } while (!c4994.m8386(value, C5890.m9722((C5890) value, false, C2340.f7777, 1)));
                MainActivity mainActivityM9214 = AbstractC5537.m9214();
                Class<BackgroundJobService> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(BackgroundJobService.class));
                Intent intent = new Intent(mainActivityM9214, clsM9037 != null ? clsM9037 : BackgroundJobService.class);
                intent.putExtra(new C4441(new long[]{367785975788601220L, -4409924997052784554L}).toString(), new C4441(new long[]{-1400328418582645264L, 2059986344953061761L, 1913694039650362465L, -3949868729397472404L}).toString());
                intent.putExtra(new C4441(new long[]{-8754893134133400045L, 1222768708070663710L}).toString(), 1000L);
                AbstractC5537.m9214().startForegroundService(intent);
                break;
            default:
                c5269.getClass();
                String str = C3436.f11406;
                MainActivity mainActivity2 = MainActivity.f411;
                C3436.m6220(AbstractC5537.m9214(), 2, new C3530(c5269, i2));
                break;
        }
        return c2358;
    }
}
