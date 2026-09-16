package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥۨؖٓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2932 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f9858;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f9859;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2932(int i, Object obj) {
        super(1);
        this.f9859 = i;
        this.f9858 = obj;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f9859;
        int i2 = 0;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f9858;
        switch (i) {
            case 0:
                InterfaceC0155 interfaceC0155 = (InterfaceC0155) obj;
                C0143 c0143 = (C0143) obj2;
                if (interfaceC0155.mo328() != Integer.MAX_VALUE) {
                    if (interfaceC0155.mo330().f568) {
                        interfaceC0155.mo327();
                    }
                    for (Map.Entry entry : interfaceC0155.mo330().f573.entrySet()) {
                        c0143.m318((AbstractC4642) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0155.mo333());
                    }
                    for (AbstractC1311 abstractC1311 = interfaceC0155.mo333().f4514; !AbstractC3831.m6874(abstractC1311, c0143.f570.mo333()); abstractC1311 = abstractC1311.f4514) {
                        for (AbstractC4642 abstractC4642 : c0143.m316(abstractC1311).keySet()) {
                            c0143.m318(abstractC4642, c0143.m313(abstractC1311, abstractC4642), abstractC1311);
                        }
                    }
                }
                return c2358;
            case 1:
                return Boolean.valueOf(((C3468) obj).m6255(((C1057) obj2).f3729));
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C4910 c4910 = (C4910) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = ((C4644) obj2).f15319;
                if (viewTreeObserverOnGlobalLayoutListenerC0850.getInsetsListener().f16030.m360() > 0) {
                    C4912 c4912 = AbstractC0722.f2637;
                    long jMo2799 = c4910.m8313().mo2799();
                    C3262 c3262 = viewTreeObserverOnGlobalLayoutListenerC0850.getInsetsListener().f16028;
                    int i3 = (int) (jMo2799 >> 32);
                    int i4 = (int) (jMo2799 & 4294967295L);
                    for (InterfaceC2144 interfaceC2144 : AbstractC0722.f2636) {
                        C4244 c4244 = (C4244) c3262.m6027(interfaceC2144);
                        AbstractC0722.m1596(c4910, ((C2285) interfaceC2144).f7593, c4244.f14061, i3, i4);
                        if (((Boolean) c4244.f14060.getValue()).booleanValue()) {
                            AbstractC0722.m1596(c4910, c4244.f14059, c4244.f14064, i3, i4);
                            AbstractC0722.m1596(c4910, c4244.f14067, c4244.f14066, i3, i4);
                        }
                        AbstractC0722.m1596(c4910, ((C2285) interfaceC2144).f7595, c4244.f14065, i3, i4);
                    }
                    C2730 c2730 = viewTreeObserverOnGlobalLayoutListenerC0850.getInsetsListener().f16031;
                    if (c2730.m5084()) {
                        C1347 c1347 = viewTreeObserverOnGlobalLayoutListenerC0850.getInsetsListener().f16029;
                        Object[] objArr = c2730.f9041;
                        int i5 = c2730.f9040;
                        while (i2 < i5) {
                            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objArr[i2];
                            C5655 c5655 = (C5655) c1347.get(i2);
                            Rect rect = (Rect) interfaceC4367.getValue();
                            c4910.m8312(c5655.m9485(), rect.left);
                            c4910.m8312(c5655.m9487(), rect.top);
                            c4910.m8312(c5655.m9484(), rect.right);
                            c4910.m8312(c5655.m9486(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(((AbstractC5746) obj2).m9572(((C3129) obj).f10473));
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return Boolean.valueOf(AbstractC1605.m3362((C3129) obj, (Resources) obj2));
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C0605) obj2).m1341((InterfaceC2880) obj);
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C2793 c2793 = (C2793) obj;
                C0485 c0485 = (C0485) obj2;
                if (c0485.f17786) {
                    AbstractC2765.m5135(c0485.m9076(), null, 0, new C0023(c0485, c2793, 0 == true ? 1 : 0, 7), 3);
                }
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C2497 c2497 = (C2497) obj;
                ((C1708) obj2).mo211(c2497);
                c2497.m4644();
                return c2358;
            case 8:
                C1453 c1453 = (C1453) obj;
                float f = c1453.f4960;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = c1453.f4959;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = c1453.f4962;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = c1453.f4961;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new C1327(C1327.m2828(AbstractC4225.m7438(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, C3444.f11443), (AbstractC3292) obj2));
            case 9:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return c2358;
            case 10:
                return new C4954(5, (C1493) obj2);
            case 11:
                return Boolean.valueOf(!AbstractC3831.m6874(obj, ((C0777) obj2).f2814.getValue()));
            case 12:
                ((C1117) obj).m2338(((Number) ((InterfaceC5372) obj2).getValue()).floatValue());
                return c2358;
            case 13:
                Throwable th = (Throwable) obj;
                C4482 c4482 = (C4482) obj2;
                C2432 c2432 = c4482.f14800;
                if (th != null) {
                    c4482.f14796.m8698(new C4027(th));
                }
                if (c2432.m4545()) {
                    ((C1988) c2432.getValue()).close();
                }
                return c2358;
            case 14:
                ((C0992) obj2).f3527 = true;
                return c2358;
            case 15:
                C3920 c3920 = (C3920) obj;
                if (!c3920.f17791.f17786) {
                    return EnumC1848.f6132;
                }
                C3920 c3921 = c3920.f13068;
                EnumC1848 enumC1848 = EnumC1848.f6133;
                if (c3921 != null) {
                    C2932 c2932 = new C2932(15, (C5086) obj2);
                    if (c2932.mo211(c3921) == enumC1848) {
                        AbstractC5378.m9064(c3921, c2932);
                    }
                }
                c3920.f13068 = null;
                c3920.f13066 = null;
                return enumC1848;
            case 16:
                if (AbstractC2091.f6884.compareAndSet(false, true)) {
                    ((C5559) obj2).mo5597(c2358);
                }
                return c2358;
            case 17:
                InterfaceC2442 interfaceC2442 = (InterfaceC2442) obj;
                C4893 c4893 = (C4893) obj2;
                C0935 c0935 = c4893.f16124;
                if (c4893.f16132 && c4893.f16119 && c0935 != null) {
                    C2808 c2808Mo3908 = interfaceC2442.mo3908();
                    long jM5355 = c2808Mo3908.m5355();
                    c2808Mo3908.m5353().mo2092();
                    try {
                        ((C2808) ((C5086) c2808Mo3908.f9378).f16877).m5353().mo2083(c0935);
                        c4893.m8230(interfaceC2442);
                    } finally {
                        c2808Mo3908.m5353().mo2095();
                        c2808Mo3908.m5351(jM5355);
                    }
                } else {
                    c4893.m8230(interfaceC2442);
                }
                return c2358;
            case 18:
                InterfaceC2442 interfaceC2443 = (InterfaceC2442) obj;
                InterfaceC3212 interfaceC3212M5353 = interfaceC2443.mo3908().m5353();
                InterfaceC5731 interfaceC5731 = ((C0281) obj2).f1014;
                if (interfaceC5731 != null) {
                    interfaceC5731.mo219(interfaceC3212M5353, (C4893) interfaceC2443.mo3908().f9376);
                }
                return c2358;
            case 19:
                AbstractC5265 abstractC5265 = (AbstractC5265) obj;
                C1412 c1412 = (C1412) obj2;
                c1412.m2984(abstractC5265);
                InterfaceC4745 interfaceC4745 = c1412.f4861;
                if (interfaceC4745 != null) {
                    interfaceC4745.mo211(abstractC5265);
                }
                return c2358;
            case 20:
                InputConnectionC2290 inputConnectionC2290 = (InputConnectionC2290) obj;
                InputConnectionC4504 inputConnectionC4504 = inputConnectionC2290.f7610;
                if (inputConnectionC4504 != null) {
                    inputConnectionC4504.closeConnection();
                    inputConnectionC2290.f7610 = null;
                }
                C4785 c4785 = (C4785) obj2;
                C0863 c0863 = c4785.f15786;
                Object[] objArr2 = c0863.f3182;
                int i6 = c0863.f3180;
                while (true) {
                    if (i2 >= i6) {
                        i2 = -1;
                    } else if (!AbstractC3831.m6874((C5756) objArr2[i2], inputConnectionC2290)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    c0863.m1850(i2);
                }
                if (c0863.f3180 == 0) {
                    c4785.f15784.mo449();
                }
                return c2358;
            case 21:
                ((C4995) obj2).cancel(false);
                return c2358;
            case 22:
                return new C5155(((C3950) obj2).f13208, (File) obj);
            case 23:
                ((C0863) obj2).m1843((InterfaceC2252) obj);
                return Boolean.TRUE;
            case 24:
                MotionEvent motionEvent = (MotionEvent) obj;
                C5157 c5157 = ((C2317) obj2).f7659;
                (c5157 != null ? c5157 : null).mo211(motionEvent);
                return c2358;
            case 25:
                AbstractC3992.m7135((InterfaceC1066) obj, ((C2155) obj2).f7116);
                return c2358;
            case 26:
                AbstractC3992.m7130((InterfaceC1066) obj, (String) obj2);
                return c2358;
            case 27:
                ((List) obj).add((Float) ((C4276) obj2).mo449());
                return true;
            default:
                C1117 c1117 = (C1117) obj;
                C4402 c4402 = (C4402) obj2;
                c1117.m2344(c1117.f3915.mo746() * 3.0f);
                c1117.m2346(c4402.f14500);
                c1117.m2340(c4402.f14499);
                c1117.m2339(c4402.f14498);
                c1117.m2342(c4402.f14501);
                return c2358;
        }
    }
}
