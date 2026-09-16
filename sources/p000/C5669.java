package p000;

import android.os.Build;
import android.util.Log;
import java.util.Map;

/* JADX INFO: renamed from: ۦۤؗؑؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5669 implements InterfaceC2615 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5009 f18647;

    /* JADX INFO: renamed from: ۦۙ */
    public static final int f18648;

    /* JADX INFO: renamed from: ۥؗ */
    public final C5899 f18649;

    /* JADX INFO: renamed from: ۥُ */
    public final C4589 f18650;

    /* JADX INFO: renamed from: ۥّ */
    public final C1387 f18651 = new C1387();

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2361 f18652;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3729 f18653;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1769 f18654;

    static {
        C4036 c4036 = C5805.f19128;
        f18648 = (int) C5805.m9621(AbstractC4009.m7166(24, EnumC3021.HOURS), EnumC3021.SECONDS);
        f18647 = new C5009("com/google/firebase/sessions//");
    }

    public C5669(C3729 c3729, InterfaceC2361 interfaceC2361, C5899 c5899, C1769 c1769, C4589 c4589) {
        this.f18653 = c3729;
        this.f18652 = interfaceC2361;
        this.f18649 = c5899;
        this.f18654 = c1769;
        this.f18650 = c4589;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a9 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x004a, B:45:0x009f, B:47:0x00a9, B:50:0x00b2), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x004a, B:45:0x009f, B:47:0x00a9, B:50:0x00b2), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00b2, please report this as an issue */
    @Override // p000.InterfaceC2615
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo4314(InterfaceC0443 interfaceC0443) throws Throwable {
        C2135 c2135;
        InterfaceC3087 interfaceC3087;
        InterfaceC3087 interfaceC3088;
        InterfaceC3087 interfaceC3089;
        String str;
        Object objM5144;
        InterfaceC3087 interfaceC30810;
        if (interfaceC0443 instanceof C2135) {
            c2135 = (C2135) interfaceC0443;
            int i = c2135.f7011;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2135.f7011 = i - Integer.MIN_VALUE;
            } else {
                c2135 = new C2135(this, (AbstractC0772) interfaceC0443);
            }
        } else {
            c2135 = new C2135(this, (AbstractC0772) interfaceC0443);
        }
        Object obj = c2135.f7008;
        int i2 = c2135.f7011;
        C4589 c4589 = this.f18650;
        int i3 = 2;
        C2358 c2358 = C2358.f7817;
        InterfaceC0443 interfaceC0444 = null;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                C1387 c1387 = this.f18651;
                if (!c1387.m2948() && !c4589.m7954()) {
                    return c2358;
                }
                c2135.f7009 = c1387;
                c2135.f7011 = 1;
                Object objMo2949 = c1387.mo2949(c2135);
                interfaceC3087 = c1387;
                if (objMo2949 != enumC2282) {
                }
                return enumC2282;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    InterfaceC3087 interfaceC30811 = c2135.f7009;
                    try {
                        AbstractC0186.m409(obj);
                        interfaceC3089 = interfaceC30811;
                        str = ((C0982) obj).f3475;
                        if (str.equals("")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            interfaceC3089.mo2950(null);
                            return c2358;
                        }
                        C3869 c3869 = new C3869("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        C5009 c5009 = f18647;
                        C3869 c38610 = new C3869("X-Crashlytics-Device-Model", c5009.f16581.matcher(str2).replaceAll(""));
                        C3869 c38611 = new C3869("X-Crashlytics-OS-Build-Version", c5009.f16581.matcher(Build.VERSION.INCREMENTAL).replaceAll(""));
                        C3869 c38612 = new C3869("X-Crashlytics-OS-Display-Version", c5009.f16581.matcher(Build.VERSION.RELEASE).replaceAll(""));
                        this.f18649.getClass();
                        Map mapM7919 = AbstractC4554.m7919(c3869, c38610, c38611, c38612, new C3869("X-Crashlytics-API-Client-Version", "3.0.7"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        C1769 c1769 = this.f18654;
                        C5030 c5030 = new C5030(this, interfaceC0444, 12);
                        C5215 c5215 = new C5215(i3, interfaceC0444, i3);
                        c2135.f7009 = interfaceC3089;
                        c2135.f7011 = 3;
                        objM5144 = AbstractC2765.m5144(c1769.f5897, new C1734(c1769, mapM7919, c5030, c5215, null, 7), c2135);
                        if (objM5144 != enumC2282) {
                            objM5144 = c2358;
                        }
                        if (objM5144 != enumC2282) {
                            interfaceC30810 = interfaceC3089;
                            interfaceC30810.mo2950(null);
                            return c2358;
                        }
                        return enumC2282;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC3088 = interfaceC30811;
                    }
                } else {
                    if (i2 != 3) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC3088 = c2135.f7009;
                    try {
                        AbstractC0186.m409(obj);
                        interfaceC30810 = interfaceC3088;
                        interfaceC30810.mo2950(null);
                        return c2358;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                interfaceC3088.mo2950(null);
                throw th;
            }
            InterfaceC3087 interfaceC30812 = c2135.f7009;
            AbstractC0186.m409(obj);
            interfaceC3087 = interfaceC30812;
            if (!c4589.m7954()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                interfaceC3087.mo2950(null);
                return c2358;
            }
            C3223 c3223 = C0982.f3473;
            InterfaceC2361 interfaceC2361 = this.f18652;
            c2135.f7009 = interfaceC3087;
            c2135.f7011 = 2;
            Object objM5947 = c3223.m5947(interfaceC2361, c2135);
            if (objM5947 != enumC2282) {
                interfaceC3089 = interfaceC3087;
                obj = objM5947;
                str = ((C0982) obj).f3475;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    interfaceC3089.mo2950(null);
                    return c2358;
                }
                C3869 c38613 = new C3869("X-Crashlytics-Installation-ID", str);
                String str3 = Build.MANUFACTURER + Build.MODEL;
                C5009 c50010 = f18647;
                C3869 c38614 = new C3869("X-Crashlytics-Device-Model", c50010.f16581.matcher(str3).replaceAll(""));
                C3869 c38615 = new C3869("X-Crashlytics-OS-Build-Version", c50010.f16581.matcher(Build.VERSION.INCREMENTAL).replaceAll(""));
                C3869 c38616 = new C3869("X-Crashlytics-OS-Display-Version", c50010.f16581.matcher(Build.VERSION.RELEASE).replaceAll(""));
                this.f18649.getClass();
                Map mapM79110 = AbstractC4554.m7919(c38613, c38614, c38615, c38616, new C3869("X-Crashlytics-API-Client-Version", "3.0.7"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                C1769 c17610 = this.f18654;
                C5030 c5031 = new C5030(this, interfaceC0444, 12);
                C5215 c5216 = new C5215(i3, interfaceC0444, i3);
                c2135.f7009 = interfaceC3089;
                c2135.f7011 = 3;
                objM5144 = AbstractC2765.m5144(c17610.f5897, new C1734(c17610, mapM79110, c5031, c5216, null, 7), c2135);
                if (objM5144 != enumC2282) {
                    objM5144 = c2358;
                }
                if (objM5144 != enumC2282) {
                    interfaceC30810 = interfaceC3089;
                    interfaceC30810.mo2950(null);
                    return c2358;
                }
            }
            return enumC2282;
        } catch (Throwable th3) {
            th = th3;
            interfaceC3088 = interfaceC3087;
        }
    }

    @Override // p000.InterfaceC2615
    /* JADX INFO: renamed from: ۥۗ */
    public final Double mo4315() {
        return this.f18650.m7955().f9882;
    }

    @Override // p000.InterfaceC2615
    /* JADX INFO: renamed from: ۥۣ */
    public final Boolean mo4316() {
        return this.f18650.m7955().f9883;
    }

    @Override // p000.InterfaceC2615
    /* JADX INFO: renamed from: ۦؑ */
    public final C5805 mo4317() {
        Integer num = this.f18650.m7955().f9880;
        if (num == null) {
            return null;
        }
        C4036 c4036 = C5805.f19128;
        return new C5805(AbstractC4009.m7166(num.intValue(), EnumC3021.SECONDS));
    }
}
