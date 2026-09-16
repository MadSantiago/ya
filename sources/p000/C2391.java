package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.EnumMap;

/* JADX INFO: renamed from: ۥۜؖؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2391 implements InterfaceC0500, InterfaceC3744, InterfaceC1170, InterfaceC5264, InterfaceC2659, InterfaceC3077 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f7924;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7925;

    public C2391(C1414 c1414) {
        C5151 c5151;
        this.f7925 = 1;
        C2782 c2782 = new C2782((AbstractC3959) c1414.f4868, 0);
        C2782 c2783 = new C2782((C0330) c1414.f4869, 1);
        C2782 c2784 = new C2782((AbstractC3959) c1414.f4870, 4);
        AbstractC3959 abstractC3959 = (AbstractC3959) c1414.f4867;
        C2782 c2785 = new C2782(abstractC3959, 2);
        C2782 c2786 = new C2782(abstractC3959, 3);
        C4908 c4908 = new C4908(abstractC3959);
        C0594 c0594 = new C0594(abstractC3959);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = (Context) c1414.f4871;
            String str = AbstractC3182.f10689;
            c5151 = new C5151((ConnectivityManager) context.getSystemService("connectivity"));
        } else {
            c5151 = null;
        }
        this.f7924 = AbstractC0246.m524(new InterfaceC5721[]{c2782, c2783, c2784, c2785, c2786, c4908, c0594, c5151});
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static C2391 m4473(String str) {
        return new C2391(9, (TextUtils.isEmpty(str) || str.length() > 1) ? EnumC3687.f12307 : C5211.m8807(str.charAt(0)));
    }

    @Override // p000.InterfaceC1170
    public void accept(Object obj, Object obj2) {
        int i = C1543.f5220;
        BinderC0222 binderC0222 = new BinderC0222((C2332) obj2);
        C3663 c3663 = (C3663) ((C5390) obj).m7333();
        byte[] bArrM5754 = ((C5437) this.f7924).m5754();
        Parcel parcelM7504 = c3663.m7504();
        AbstractC5564.m9344(parcelM7504, binderC0222);
        parcelM7504.writeByteArray(bArrM5754);
        c3663.m7505(parcelM7504, 31);
    }

    @Override // p000.InterfaceC3077
    public Object get() {
        int i = this.f7925;
        Object obj = this.f7924;
        switch (i) {
            case 13:
                return new C4152(new C4110((InterfaceC3077) ((C2813) obj).f9389));
            case 14:
                Object obj2 = C0996.f3556;
                return (InterfaceC2735) ((AbstractC3538) ((InterfaceC3077) obj).get()).mo3983();
            default:
                C3882 c3882 = (C3882) obj;
                ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499 = (ScheduledExecutorServiceC3499) c3882.f12974.get();
                scheduledExecutorServiceC3499.getClass();
                C2022 c2022 = (C2022) c3882.f12977.get();
                c2022.getClass();
                C1543 c1543 = c2022.f6662;
                C5470 c5470M9153 = C5470.m9153();
                c5470M9153.f18034 = new C3743(2, c1543);
                c5470M9153.f18037 = new C2274[]{AbstractC0186.f691};
                c5470M9153.f18035 = false;
                C0008 c0008M3941 = C2022.m3941(c1543.m7829(0, c5470M9153.m9158()));
                C0005 c0005 = new C0005(c0008M3941, C3849.class, C5816.f19148);
                c0008M3941.mo3760(c0005, AbstractC0993.m2137(scheduledExecutorServiceC3499, c0005));
                C0347 c0347 = new C0347(1, c3882);
                int i2 = AbstractRunnableC0022.f4488;
                C0081 c0081 = new C0081(c0005, c0347);
                c0005.mo3760(c0081, AbstractC0993.m2137(scheduledExecutorServiceC3499, c0081));
                c0081.mo3760(new RunnableC3365(27, c0081), scheduledExecutorServiceC3499);
                return c0081;
        }
    }

    public String toString() {
        switch (this.f7925) {
            case 8:
                StringBuilder sb = new StringBuilder("1");
                for (EnumC4635 enumC4635 : EnumC4635.values()) {
                    EnumC2962 enumC2962 = (EnumC2962) ((EnumMap) this.f7924).get(enumC4635);
                    if (enumC2962 == null) {
                        enumC2962 = EnumC2962.UNSET;
                    }
                    sb.append(enumC2962.f9937);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0500
    /* JADX INFO: renamed from: ۥؗ */
    public void mo1143() {
        ((InterfaceC1895) this.f7924).mo1895();
    }

    @Override // p000.InterfaceC2659
    /* JADX INFO: renamed from: ۥُ */
    public void mo3987(C3580 c3580) {
        C2801 c2801 = (C2801) this.f7924;
        if (c3580.f11913) {
            c2801.cancel(false);
            return;
        }
        if (c3580.m6390()) {
            c2801.m3762(c3580.m6388());
            return;
        }
        Exception excM6387 = c3580.m6387();
        if (excM6387 == null) {
            throw new IllegalStateException();
        }
        c2801.m3763(excM6387);
    }

    /* JADX INFO: renamed from: ۥّ */
    public C5856 m4474(String str, boolean z) {
        return new C5856(str, (C3225) this.f7924, z);
    }

    @Override // p000.InterfaceC5264
    /* JADX INFO: renamed from: ۥۗ */
    public void mo4475(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5235 c5235 = (C5235) this.f7924;
        if (zIsEmpty) {
            c5235.m8881("auto", "_err", bundle);
        } else {
            C1078.m2276("Unexpected call on client side");
        }
    }

    @Override // p000.InterfaceC0500
    /* JADX INFO: renamed from: ۥۣ */
    public void mo1144(int i) {
        ((InterfaceC1895) this.f7924).mo1897(i);
    }

    @Override // p000.InterfaceC3744
    /* JADX INFO: renamed from: ۦؑ */
    public void mo2246(Object obj) {
        ((C2332) ((C2391) this.f7924).f7924).f7721.m6394();
    }

    /* JADX INFO: renamed from: ۦِ */
    public void m4476(int i, Object obj, InterfaceC0759 interfaceC0759) {
        AbstractC0438 abstractC0438 = (AbstractC0438) this.f7924;
        AbstractC3127 abstractC3127 = (AbstractC3127) obj;
        abstractC0438.mo944(i, 2);
        abstractC0438.mo941(abstractC3127.mo5753(interfaceC0759));
        interfaceC0759.mo1647(abstractC3127, this);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m4477(EnumC4635 enumC4635, EnumC2962 enumC2962) {
        ((EnumMap) this.f7924).put(enumC4635, enumC2962);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX INFO: renamed from: ۦۙ */
    public void m4478(EnumC4635 enumC4635, int i) {
        EnumC2962 enumC2962;
        if (i == -30) {
            enumC2962 = EnumC2962.TCF;
        } else if (i == -20) {
            enumC2962 = EnumC2962.API;
        } else if (i == -10) {
            enumC2962 = EnumC2962.MANIFEST;
        } else if (i != 0) {
            enumC2962 = i != 30 ? EnumC2962.UNSET : EnumC2962.INITIALIZATION;
        } else {
            enumC2962 = EnumC2962.API;
        }
        ((EnumMap) this.f7924).put(enumC4635, enumC2962);
    }

    public C2391(C1039 c1039, C2391 c2391) {
        this.f7925 = 6;
        this.f7924 = c2391;
    }

    public C2391(AbstractC0438 abstractC0438) {
        this.f7925 = 7;
        this.f7924 = abstractC0438;
        abstractC0438.f1610 = this;
    }

    public C2391(int i) {
        this.f7925 = i;
        switch (i) {
            case 8:
                this.f7924 = new EnumMap(EnumC4635.class);
                break;
            default:
                Object obj = C1991.f6569;
                this.f7924 = new SparseIntArray();
                break;
        }
    }

    public C2391(EnumMap enumMap) {
        this.f7925 = 8;
        EnumMap enumMap2 = new EnumMap(EnumC4635.class);
        this.f7924 = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public /* synthetic */ C2391(int i, Object obj) {
        this.f7925 = i;
        this.f7924 = obj;
    }
}
