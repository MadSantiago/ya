package p000;

import android.content.SharedPreferences;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۥٖۛؓٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2315 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f7653 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public int f7654;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3103 f7655;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C4417 f7656;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2315(C3103 c3103, C4417 c4417, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f7655 = c3103;
        this.f7656 = c4417;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f7653;
        C4417 c4417 = this.f7656;
        C3103 c3103 = this.f7655;
        switch (i) {
            case 0:
                return new C2315(c4417, c3103, interfaceC0443);
            default:
                return new C2315(c3103, c4417, interfaceC0443);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f7653;
        C2358 c2358 = C2358.f7817;
        C4417 c4417 = this.f7656;
        C3103 c3103 = this.f7655;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f7654;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C0178.m389(new C4441(new long[]{-608418540807652031L, -3019576164646064998L, -3015605566459461213L, 5128388219609752361L, 939958147210132644L, 7175663110602526499L, -5148747477621637466L}));
                    return null;
                }
                AbstractC0186.m409(obj);
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f410;
                c1443.getClass();
                C2518 c2518 = new C2518(c1443);
                c2518.m4661(Integer.valueOf(c3103.f10404), AbstractC2539.f8441.f5219);
                SharedPreferences.Editor editor = c2518.f8351;
                if (editor != null) {
                    editor.apply();
                }
                if (!C1443.f4940 && !c1443.f4943) {
                    try {
                        AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                        break;
                    } catch (Throwable unused) {
                    }
                }
                C1705 c1705 = c4417.f14562;
                this.f7654 = 1;
                return c1705.m3521(this) == enumC2282 ? enumC2282 : c2358;
            default:
                int i3 = this.f7654;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C0178.m389(new C4441(new long[]{-4279850195347609593L, -619379903811207564L, 9051577907667194097L, -4536813066276765886L, -8061896800455302147L, 810611781793372273L, -3573753498037167671L}));
                    return null;
                }
                AbstractC0186.m409(obj);
                MainActivity mainActivity = MainActivity.f411;
                AbstractC4489.m7770(AbstractC5537.m9214(), c3103.f10403);
                C1705 c1706 = c4417.f14562;
                this.f7654 = 1;
                return c1706.m3521(this) == enumC2282 ? enumC2282 : c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f7653;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C2315) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2315(C4417 c4417, C3103 c3103, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f7656 = c4417;
        this.f7655 = c3103;
    }
}
