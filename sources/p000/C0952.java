package p000;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: renamed from: ۥٌٍؘؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0952 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f3381;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ boolean f3382;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f3383;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0952(Object obj, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f3381 = i;
        this.f3383 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f3381;
        Object obj2 = this.f3383;
        switch (i) {
            case 0:
                C0952 c0952 = new C0952((C4153) obj2, interfaceC0443, 0);
                c0952.f3382 = ((Boolean) obj).booleanValue();
                return c0952;
            default:
                C0952 c0953 = new C0952((Context) obj2, interfaceC0443, 1);
                c0953.f3382 = ((Boolean) obj).booleanValue();
                return c0953;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f3381;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f3383;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                if (!this.f3382) {
                    ((C4153) obj2).m7348();
                }
                break;
            default:
                AbstractC0186.m409(obj);
                AbstractC1466.m3083((Context) obj2, RescheduleReceiver.class, this.f3382);
                break;
        }
        return c2358;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f3381;
        C2358 c2358 = C2358.f7817;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                ((C0952) mo217(interfaceC0443, bool)).mo218(c2358);
                break;
            default:
                ((C0952) mo217(interfaceC0443, bool)).mo218(c2358);
                break;
        }
        return c2358;
    }
}
