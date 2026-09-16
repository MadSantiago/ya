package p000;

import android.util.Log;
import java.util.Map;

/* JADX INFO: renamed from: ۥِّْؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1188 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ C1521 f4086;

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ C3086 f4087;

    /* JADX INFO: renamed from: ۥَ */
    public C0982 f4088;

    /* JADX INFO: renamed from: ۥٖ */
    public C3086 f4089;

    /* JADX INFO: renamed from: ۥٙ */
    public int f4090;

    /* JADX INFO: renamed from: ۥۖ */
    public C1521 f4091;

    /* JADX INFO: renamed from: ۦٕ */
    public C1802 f4092;

    /* JADX INFO: renamed from: ۦٗ */
    public C4802 f4093;

    /* JADX INFO: renamed from: ۦۛ */
    public C0377 f4094;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188(C3086 c3086, C1521 c1521, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f4087 = c3086;
        this.f4086 = c1521;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C1188(this.f4087, this.f4086, interfaceC0443);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        Object objM5675;
        Object objM5947;
        C0982 c0982;
        C4802 c4802;
        C0377 c0377;
        C1802 c1802;
        C1521 c1521;
        Object objM493;
        C1521 c1522;
        C2702 c2702;
        EnumC4018 enumC4018;
        EnumC4018 enumC4019;
        EnumC4018 enumC40110;
        EnumC4018 enumC40111;
        C2702 c2703;
        int i = this.f4090;
        C3086 c3086 = this.f4087;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i == 0) {
            AbstractC0186.m409(obj);
            this.f4090 = 1;
            int i2 = C3086.f10348;
            objM5675 = c3086.m5675(this);
            if (objM5675 != enumC2282) {
            }
            return enumC2282;
        }
        if (i == 1) {
            AbstractC0186.m409(obj);
            objM5675 = obj;
        } else {
            if (i == 2) {
                AbstractC0186.m409(obj);
                objM5947 = obj;
                c0982 = (C0982) objM5947;
                c4802 = C4802.f15841;
                c0377 = c3086.f10352;
                c1802 = c3086.f10349;
                C0230 c0230 = C0230.f872;
                this.f4088 = c0982;
                this.f4089 = c3086;
                this.f4093 = c4802;
                this.f4094 = c0377;
                c1521 = this.f4086;
                this.f4091 = c1521;
                this.f4092 = c1802;
                this.f4090 = 3;
                objM493 = c0230.m493(this);
                if (objM493 != enumC2282) {
                    c1522 = c1521;
                }
                return enumC2282;
            }
            if (i != 3) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C1802 c1803 = this.f4092;
            c1522 = this.f4091;
            c0377 = this.f4094;
            c4802 = this.f4093;
            c3086 = this.f4089;
            C0982 c0983 = this.f4088;
            AbstractC0186.m409(obj);
            c1802 = c1803;
            c0982 = c0983;
            objM493 = obj;
        }
        Map map = (Map) objM493;
        String str = c0982.f3475;
        String str2 = c0982.f3474;
        c4802.getClass();
        String str3 = c1522.f5162;
        String str4 = c1522.f5161;
        int i3 = c1522.f5160;
        long j = c1522.f5163;
        c2702 = (C2702) map.get(EnumC1499.f5084);
        enumC4018 = EnumC4018.f13402;
        enumC4019 = EnumC4018.f13401;
        enumC40110 = EnumC4018.f13403;
        if (c2702 == null) {
            enumC40111 = enumC40110;
        } else if (c2702.f8961.m2929()) {
            enumC40111 = enumC4019;
        } else {
            enumC40111 = enumC4018;
        }
        c2703 = (C2702) map.get(EnumC1499.f5085);
        if (c2703 == null) {
            enumC4018 = enumC40110;
        } else if (c2703.f8961.m2929()) {
            enumC4018 = enumC4019;
        }
        C4193 c4193 = new C4193(new C5314(str3, str4, i3, j, new C1760(enumC40111, enumC4018, c1802.m3586()), str, str2), C4802.m8180(c0377));
        int i4 = C3086.f10348;
        c3086.getClass();
        try {
            c3086.f10353.m4425(c4193);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
        }
        return C2358.f7817;
        if (((Boolean) objM5675).booleanValue()) {
            InterfaceC2361 interfaceC2361 = c3086.f10351;
            this.f4090 = 2;
            objM5947 = C0982.f3473.m5947(interfaceC2361, this);
            if (objM5947 != enumC2282) {
                c0982 = (C0982) objM5947;
                c4802 = C4802.f15841;
                c0377 = c3086.f10352;
                c1802 = c3086.f10349;
                C0230 c0231 = C0230.f872;
                this.f4088 = c0982;
                this.f4089 = c3086;
                this.f4093 = c4802;
                this.f4094 = c0377;
                c1521 = this.f4086;
                this.f4091 = c1521;
                this.f4092 = c1802;
                this.f4090 = 3;
                objM493 = c0231.m493(this);
                if (objM493 != enumC2282) {
                    c1522 = c1521;
                    Map map2 = (Map) objM493;
                    String str5 = c0982.f3475;
                    String str6 = c0982.f3474;
                    c4802.getClass();
                    String str7 = c1522.f5162;
                    String str8 = c1522.f5161;
                    int i5 = c1522.f5160;
                    long j2 = c1522.f5163;
                    c2702 = (C2702) map2.get(EnumC1499.f5084);
                    enumC4018 = EnumC4018.f13402;
                    enumC4019 = EnumC4018.f13401;
                    enumC40110 = EnumC4018.f13403;
                    if (c2702 == null) {
                        enumC40111 = enumC40110;
                    } else if (c2702.f8961.m2929()) {
                        enumC40111 = enumC4019;
                    } else {
                        enumC40111 = enumC4018;
                    }
                    c2703 = (C2702) map2.get(EnumC1499.f5085);
                    if (c2703 == null) {
                        enumC4018 = enumC40110;
                    } else if (c2703.f8961.m2929()) {
                        enumC4018 = enumC4019;
                    }
                    C4193 c4194 = new C4193(new C5314(str7, str8, i5, j2, new C1760(enumC40111, enumC4018, c1802.m3586()), str5, str6), C4802.m8180(c0377));
                    int i6 = C3086.f10348;
                    c3086.getClass();
                    c3086.f10353.m4425(c4194);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                }
            }
            return enumC2282;
        }
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C1188) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
