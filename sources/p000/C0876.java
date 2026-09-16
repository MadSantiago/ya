package p000;

import android.content.SharedPreferences;
import android.view.textclassifier.TextClassifier;
import java.io.IOException;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥٌؑٚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0876 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f3205;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f3206;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0876(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f3205 = i;
        this.f3206 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f3205;
        Object obj2 = this.f3206;
        switch (i) {
            case 0:
                return new C0876((C4153) obj2, interfaceC0443, 0);
            case 1:
                return new C0876((C0992) obj2, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0876((C0385) obj2, interfaceC0443, 2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0876((C2944) obj2, interfaceC0443, 3);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C0876((C3985) obj2, interfaceC0443, 4);
            default:
                return new C0876((C0346) obj2, interfaceC0443, 5);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        switch (this.f3205) {
            case 0:
                AbstractC0186.m409(obj);
                ((C4153) this.f3206).m7348();
                return C2358.f7817;
            case 1:
                AbstractC0186.m409(obj);
                C0992 c0992 = (C0992) this.f3206;
                synchronized (c0992) {
                    try {
                        if (!c0992.f3521 || c0992.f3520) {
                            return C2358.f7817;
                        }
                        try {
                            c0992.m2121();
                            break;
                        } catch (IOException unused) {
                            c0992.f3529 = true;
                        }
                        try {
                            if (c0992.f3528 >= 2000) {
                                c0992.m2119();
                            }
                            break;
                        } catch (IOException unused2) {
                            c0992.f3522 = true;
                            c0992.f3530 = new C5025(new C3373());
                        }
                        return C2358.f7817;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0186.m409(obj);
                C0385 c0385 = (C0385) this.f3206;
                TextClassifier textClassifierM4931 = AbstractC2611.m4931(c0385.f1437, c0385.f1434);
                c0385.f1436 = textClassifierM4931;
                return textClassifierM4931;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0186.m409(obj);
                return (C2944) this.f3206;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0186.m409(obj);
                C3985.m7129((C3985) this.f3206);
                return C2358.f7817;
            default:
                AbstractC0186.m409(obj);
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f410;
                C0346 c0346 = (C0346) this.f3206;
                c1443.getClass();
                C2518 c2518 = new C2518(c1443);
                c2518.m4661(c0346.f1277, AbstractC2539.f8448.f5219);
                C2358 c2358 = C2358.f7817;
                SharedPreferences.Editor editor = c2518.f8351;
                if (editor != null) {
                    editor.apply();
                }
                if (!C1443.f4940 && !c1443.f4943) {
                    try {
                        AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                        break;
                    } catch (Throwable unused3) {
                    }
                }
                AbstractC3533.m6324(c0346.f1275);
                return c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f3205;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((C0876) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
                return c2358;
            case 1:
                return ((C0876) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0876) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0876 c0876 = (C0876) mo217((InterfaceC0443) obj2, (C2944) obj);
                AbstractC0186.m409(c2358);
                return (C2944) c0876.f3206;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((C0876) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
                return c2358;
            default:
                ((C0876) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
                return c2358;
        }
    }
}
