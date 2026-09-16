package p000;

import android.util.Log;

/* JADX INFO: renamed from: ۥّٜؓٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1155 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f4009;

    /* JADX INFO: renamed from: ۥٖ */
    public int f4010;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C0909 f4011;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1155(C0909 c0909, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f4009 = i;
        this.f4011 = c0909;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f4009;
        C0909 c0909 = this.f4011;
        switch (i) {
            case 0:
                return new C1155(c0909, interfaceC0443, 0);
            default:
                return new C1155(c0909, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f4009;
        Object obj2 = C2358.f7817;
        int i2 = 5;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C0909 c0909 = this.f4011;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                int i3 = this.f4010;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return obj2;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C1736 c1736 = new C1736(2, c0909.f3262.mo2232(), new C1247(c0909, null));
                C0462 c0462 = new C0462(i2, c0909);
                this.f4010 = 1;
                return c1736.mo1575(c0462, this) == enumC2282 ? enumC2282 : obj2;
            default:
                int i4 = this.f4010;
                try {
                    if (i4 == 0) {
                        AbstractC0186.m409(obj);
                        InterfaceC1015 interfaceC1015 = c0909.f3262;
                        C3062 c3062 = new C3062(c0909, interfaceC0443, 0);
                        this.f4010 = 1;
                        if (interfaceC1015.mo2233(c3062, this) == enumC2282) {
                            obj2 = enumC2282;
                        }
                    } else {
                        if (i4 != 1) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj);
                    }
                    return obj2;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    C1109 c1109 = c0909.f3265;
                    if (c1109 == null) {
                        c1109 = null;
                    }
                    c0909.f3267.getClass();
                    c0909.f3265 = C1109.m2327(c1109, null, C3729.m6575(), null, 5);
                    return obj2;
                }
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f4009;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C1155) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
