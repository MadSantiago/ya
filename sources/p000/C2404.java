package p000;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥُۜؗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2404 implements InterfaceC4137 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f8010;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f8011;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8012;

    public C2404(C2527 c2527) {
        this.f8012 = 1;
        this.f8011 = c2527;
        this.f8010 = new C1414(0);
    }

    @Override // p000.InterfaceC4137
    public InterfaceC2218 getKey() {
        return C0373.f1374;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX INFO: renamed from: ۥؗ */
    public final Object m4526(InterfaceC4745 interfaceC4745, InterfaceC0443 interfaceC0443) {
        C1125 c1125;
        boolean z;
        Object objM4909;
        int i = 4;
        switch (this.f8012) {
            case 0:
                C5418 c5418 = (C5418) this.f8010;
                C2600 c2600 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
                c2600.m4913();
                ChoreographerFrameCallbackC4420 choreographerFrameCallbackC4420 = new ChoreographerFrameCallbackC4420(c2600, this, interfaceC4745);
                if (AbstractC3831.m6874(c5418.f17892, (Choreographer) this.f8011)) {
                    synchronized (c5418.f17885) {
                        c5418.f17886.add(choreographerFrameCallbackC4420);
                        if (!c5418.f17888) {
                            c5418.f17888 = true;
                            c5418.f17892.postFrameCallback(c5418.f17889);
                        }
                        break;
                    }
                    c2600.m4908(new C5544(3, c5418, choreographerFrameCallbackC4420));
                } else {
                    ((Choreographer) this.f8011).postFrameCallback(choreographerFrameCallbackC4420);
                    c2600.m4908(new C5544(i, this, choreographerFrameCallbackC4420));
                }
                return c2600.m4909();
            case 1:
                C2600 c2601 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
                c2601.m4913();
                C1414 c1414 = (C1414) this.f8010;
                C5367 c5367 = new C5367();
                c5367.f17700 = c2601;
                c5367.f17699 = interfaceC4745;
                c2601.m4908(new C5757(0, c1414.m2991(c5367, (C2527) this.f8011)));
                return c2601.m4909();
            default:
                if (interfaceC0443 instanceof C1125) {
                    c1125 = (C1125) interfaceC0443;
                    int i2 = c1125.f3955;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1125.f3955 = i2 - Integer.MIN_VALUE;
                    } else {
                        c1125 = new C1125(this, interfaceC0443);
                    }
                } else {
                    c1125 = new C1125(this, interfaceC0443);
                }
                Object obj = c1125.f3952;
                EnumC2282 enumC2282 = EnumC2282.f7590;
                int i3 = c1125.f3955;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    C1405 c1405 = (C1405) this.f8010;
                    c1125.f3953 = interfaceC4745;
                    c1125.f3955 = 1;
                    synchronized (c1405.f4836) {
                        z = c1405.f4837;
                    }
                    if (z) {
                        objM4909 = C2358.f7817;
                    } else {
                        C2600 c2602 = new C2600(1, AbstractC2776.m5232(c1125));
                        c2602.m4913();
                        synchronized (c1405.f4836) {
                            ((ArrayList) c1405.f4835).add(c2602);
                        }
                        c2602.m4908(new C0519(i, c1405, c2602));
                        objM4909 = c2602.m4909();
                        if (objM4909 != enumC2282) {
                            objM4909 = C2358.f7817;
                        }
                    }
                    if (objM4909 != enumC2282) {
                    }
                    return enumC2282;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        AbstractC0186.m409(obj);
                        return obj;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC4745 = c1125.f3953;
                AbstractC0186.m409(obj);
                C2404 c2404 = (C2404) this.f8011;
                c1125.f3953 = null;
                c1125.f3955 = 2;
                Object objM4526 = c2404.m4526(interfaceC4745, c1125);
                if (objM4526 != enumC2282) {
                    return objM4526;
                }
                return enumC2282;
        }
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        switch (this.f8012) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        switch (this.f8012) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC3801.m6745(this, interfaceC2218);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        switch (this.f8012) {
            case 0:
                break;
            case 1:
                break;
        }
        return interfaceC5731.mo219(obj, this);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        switch (this.f8012) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC3801.m6798(this, interfaceC2218);
    }

    public C2404(C2404 c2404) {
        this.f8012 = 2;
        this.f8011 = c2404;
        this.f8010 = new C1405();
    }

    public C2404(Choreographer choreographer, C5418 c5418) {
        this.f8012 = 0;
        this.f8011 = choreographer;
        this.f8010 = c5418;
    }
}
