package p000;

import android.util.Log;

/* JADX INFO: renamed from: ۦؘۛؒۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5215 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f17222;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f17223;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5215(int i, InterfaceC0443 interfaceC0443, int i2) {
        super(i, interfaceC0443);
        this.f17222 = i2;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f17222) {
            case 0:
                C5215 c5215 = new C5215(2, interfaceC0443, 0);
                c5215.f17223 = obj;
                return c5215;
            case 1:
                C5215 c5216 = new C5215(2, interfaceC0443, 1);
                c5216.f17223 = obj;
                return c5216;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5215 c5217 = new C5215(2, interfaceC0443, 2);
                c5217.f17223 = obj;
                return c5217;
            default:
                C5215 c5218 = new C5215(2, interfaceC0443, 3);
                c5218.f17223 = obj;
                return c5218;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        switch (this.f17222) {
            case 0:
                AbstractC0186.m409(obj);
                return Boolean.valueOf(!(((AbstractC1996) this.f17223) instanceof C4027));
            case 1:
                AbstractC0186.m409(obj);
                return Boolean.valueOf(((EnumC3359) this.f17223) == EnumC3359.f11230);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0186.m409(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f17223));
                return C2358.f7817;
            default:
                EnumC0484 enumC0484 = (EnumC0484) this.f17223;
                AbstractC0186.m409(obj);
                return Boolean.valueOf(enumC0484 != EnumC0484.f1763);
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f17222;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C5215) mo217((InterfaceC0443) obj2, (AbstractC1996) obj)).mo218(c2358);
            case 1:
                return ((C5215) mo217((InterfaceC0443) obj2, (EnumC3359) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C5215) mo217((InterfaceC0443) obj2, (String) obj)).mo218(c2358);
                return c2358;
            default:
                return ((C5215) mo217((InterfaceC0443) obj2, (EnumC0484) obj)).mo218(c2358);
        }
    }
}
