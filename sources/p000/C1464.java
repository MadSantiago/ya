package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥًؚٖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1464 implements InterfaceC3901 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2600 f4978;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4979;

    public /* synthetic */ C1464(C2600 c2600, int i) {
        this.f4979 = i;
        this.f4978 = c2600;
    }

    @Override // p000.InterfaceC3901
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3081(Throwable th) {
        int i = this.f4979;
        C2600 c2600 = this.f4978;
        switch (i) {
            case 0:
                c2600.mo335(new C4535(th));
                break;
            default:
                c2600.mo335(new C4535(th));
                break;
        }
    }

    @Override // p000.InterfaceC3901
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3082(InterfaceC5065 interfaceC5065, C4633 c4633) {
        int i = this.f4979;
        C2600 c2600 = this.f4978;
        switch (i) {
            case 0:
                if (!c4633.f15293.m4177()) {
                    c2600.mo335(new C4535(new C1228(c4633)));
                } else {
                    Object obj = c4633.f15292;
                    if (obj != null) {
                        c2600.mo335(obj);
                    } else {
                        C3513 c3513 = (C3513) C3513.class.cast(((Map) interfaceC5065.mo1602().f9391).get(C3513.class));
                        c2600.mo335(new C4535(new C4280("Response from " + c3513.f11631.getName() + '.' + c3513.f11629.getName() + " was null but response body type was declared as non-null")));
                    }
                }
                break;
            default:
                c2600.mo335(c4633);
                break;
        }
    }
}
