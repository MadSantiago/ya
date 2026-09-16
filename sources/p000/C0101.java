package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.work.impl.WorkDatabase_Impl;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.util.Arrays;
import java.util.UUID;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۦۨ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0101 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f19306;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f19307;

    public /* synthetic */ C0101(AbstractC0548 abstractC0548, long j) {
        this.f19307 = 3;
        this.f19306 = abstractC0548;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f19307;
        boolean z = true;
        z = true;
        C2358 c2358 = C2358.f7817;
        Object obj = this.f19306;
        switch (i) {
            case 0:
                SideActivity sideActivity = SideActivity.f416;
                AbstractC4489.m7770(AbstractC4489.m7812(), (String) obj);
                return c2358;
            case 1:
                AbstractC5378.m9047((C2756) obj);
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((InterfaceC3320) obj).mo776();
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C0714) ((AbstractC0548) obj)).f2616;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C0084(z ? 1 : 0, (Object[]) obj);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return (C1249) obj;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return (C2793) obj;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C2572(((C1046) obj).f3700);
            case 8:
                return ((C5002) obj).mo5739(":memory:");
            case 9:
                return ((C5837) obj).m9648();
            case 10:
                return new C4950((EnumC1616) obj, 0.0f);
            case 11:
                String string = new C4441(new long[]{-155665427568545607L, 7625565458434419517L, -7296604096941475503L, 309980379654761315L}).toString();
                C4524.f14953.getClass();
                ((C1489) obj).m3140(C4524.f14956, string);
                return c2358;
            case 12:
                ((C0843) obj).close();
                return c2358;
            case 13:
                C5836 c5836 = (C5836) obj;
                return "(" + AbstractC0973.m2056(c5836.f19214, "", null, null, new C3018(14), 30) + ")" + AbstractC1650.m3461(c5836.f19218);
            case 14:
                ((C0579) obj).f2073.await();
                return c2358;
            case 15:
                C1684 c1684 = (C1684) obj;
                C0322 c0322 = c1684.f5602;
                Context context = c1684.f5607;
                String str = c1684.f5606;
                C3289 c3289 = (str == null || !c1684.f5603) ? new C3289(context, c1684.f5606, new C4228(27), c0322, c1684.f5601) : new C3289(context, new File(context.getNoBackupFilesDir(), str).getAbsolutePath(), new C4228(27), c0322, c1684.f5601);
                c3289.setWriteAheadLoggingEnabled(c1684.f5605);
                return c3289;
            case 16:
                return ((XC_MethodHook.Unhook) obj).getHookedMethod();
            case 17:
                return (InputMethodManager) ((View) ((C5002) obj).f16551).getContext().getSystemService("input_method");
            case 18:
                WorkDatabase_Impl workDatabase_Impl = ((C4775) obj).f15744;
                if (workDatabase_Impl.m97() && !workDatabase_Impl.m96()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                return Integer.valueOf(((C0846) obj).m1759().f4375);
            case 20:
                return new BaseInputConnection(((C2734) obj).f9053, false);
            case 21:
                return new C5836(((C3570) obj).f11821);
            case 22:
                ((DialogC0997) obj).f3567.mo449();
                return c2358;
            case 23:
                return new C4051((C4023) obj);
            case 24:
                return Integer.valueOf(((AbstractC0631) obj).mo1406());
            case 25:
                C1527 c1527 = (C1527) obj;
                return new C2543(AbstractC1631.m3433("kotlinx.serialization.Polymorphic", C5384.f17800, new InterfaceC0103[0], new C0091(25, c1527)), c1527.f5173);
            case 26:
                ((C3142) obj).getClass();
                return UUID.randomUUID().toString();
            case 27:
                C5869 c5869 = (C5869) obj;
                InterfaceC2856 interfaceC2856 = c5869.f19387;
                Object obj2 = c5869.f19383;
                if (obj2 != null) {
                    return interfaceC2856.mo3467(c5869, obj2);
                }
                C1078.m2272("Value should be initialized");
                return null;
            case 28:
                C2346 c2346 = ((C2950) obj).f9893;
                if (c2346 == null) {
                    return null;
                }
                Bundle bundleM7904 = AbstractC4554.m7904((C3869[]) Arrays.copyOf(new C3869[0], 0));
                c2346.m4402(bundleM7904);
                if (bundleM7904.isEmpty()) {
                    return null;
                }
                return bundleM7904;
            default:
                return AbstractC2765.m5137((InterfaceC4680) obj);
        }
    }

    public /* synthetic */ C0101(int i, Object obj) {
        this.f19307 = i;
        this.f19306 = obj;
    }
}
