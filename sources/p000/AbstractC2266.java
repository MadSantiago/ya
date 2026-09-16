package p000;

/* JADX INFO: renamed from: ۥۚؓٝۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2266 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1520 f7523;

    public AbstractC2266(InterfaceC4448 interfaceC4448) {
        this.f7523 = new C1520(interfaceC4448);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3633 m4311(C3467 c3467, InterfaceC3633 interfaceC3633) {
        C2787 c2787;
        InterfaceC3633 interfaceC3634 = null;
        interfaceC3634 = null;
        interfaceC3634 = null;
        interfaceC3634 = null;
        interfaceC3634 = null;
        interfaceC3634 = null;
        if (interfaceC3633 instanceof C2787) {
            if (c3467.f11506) {
                c2787 = (C2787) interfaceC3633;
                c2787.f9291.setValue(c3467.m6243());
            }
        } else if (interfaceC3633 instanceof C4348) {
            if ((c3467.f11501 || c3467.f11504 != null) && !c3467.f11506) {
                C4348 c4348 = (C4348) interfaceC3633;
                if (AbstractC3831.m6874(c3467.m6243(), c4348.f14339)) {
                    interfaceC3634 = c4348;
                }
            }
        } else if (interfaceC3633 instanceof C2486) {
            c3467.getClass();
        }
        if (interfaceC3634 != null) {
            interfaceC3634 = c2787;
            return interfaceC3634;
        }
        if (!c3467.f11506) {
            interfaceC3634 = c2787;
            return new C4348(c3467.m6243());
        }
        Object obj = c3467.f11504;
        InterfaceC0241 interfaceC0241 = (InterfaceC0241) c3467.f11505;
        if (interfaceC0241 == null) {
            interfaceC3634 = c2787;
            interfaceC0241 = C1298.f4439;
        }
        interfaceC3634 = c2787;
        return new C2787(new C4852(obj, interfaceC0241));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC3633 mo4312() {
        return this.f7523;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract C3467 mo4313(Object obj);
}
