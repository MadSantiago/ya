package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥؘِؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1083 extends AbstractC0938 {

    /* JADX INFO: renamed from: ۥَ */
    public final Object f3785;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f3786;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1083(Object obj, InterfaceC3534 interfaceC3534, int i, int i2, int i3) {
        super(interfaceC3534, i, i2);
        this.f3786 = i3;
        this.f3785 = obj;
    }

    @Override // p000.AbstractC0938
    public String toString() {
        switch (this.f3786) {
            case 0:
                return "block[" + ((InterfaceC5731) this.f3785) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.AbstractC0938
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo1910(C3002 c3002, InterfaceC0443 interfaceC0443) {
        int i = this.f3786;
        C2358 c2358 = C2358.f7817;
        Object obj = this.f3785;
        switch (i) {
            case 0:
                Object objMo219 = ((InterfaceC5731) obj).mo219(c3002, interfaceC0443);
                return objMo219 == EnumC2282.f7590 ? objMo219 : c2358;
            default:
                C2475 c2475 = new C2475(c3002);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    AbstractC2765.m5135(c3002, null, 0, new C0023((InterfaceC4707) it.next(), c2475, null, 12), 3);
                }
                return c2358;
        }
    }

    @Override // p000.AbstractC0938
    /* JADX INFO: renamed from: ۥّ */
    public C3002 mo1912(InterfaceC4643 interfaceC4643) throws Throwable {
        switch (this.f3786) {
            case 1:
                InterfaceC5731 c0023 = new C0023(this, null, 10);
                C3002 c3002 = new C3002(AbstractC2774.m5173(interfaceC4643, this.f3335), AbstractC1631.m3405(this.f3334, 1, 4));
                c3002.m3707(1, c3002, c0023);
                return c3002;
            default:
                return super.mo1912(interfaceC4643);
        }
    }

    @Override // p000.AbstractC0938
    /* JADX INFO: renamed from: ۦؑ */
    public AbstractC0938 mo1813(InterfaceC3534 interfaceC3534, int i, int i2) {
        int i3 = this.f3786;
        Object obj = this.f3785;
        switch (i3) {
            case 0:
                return new C1083((InterfaceC5731) obj, interfaceC3534, i, i2, 0);
            default:
                return new C1083((Iterable) obj, interfaceC3534, i, i2, 1);
        }
    }
}
