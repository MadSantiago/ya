package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦؔؕۜؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3229 implements InterfaceC3534, Serializable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC4137 f10844;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3534 f10845;

    public C3229(InterfaceC3534 interfaceC3534, InterfaceC4137 interfaceC4137) {
        this.f10845 = interfaceC3534;
        this.f10844 = interfaceC4137;
    }

    public final boolean equals(Object obj) {
        boolean zM6874;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3229) {
            C3229 c3229 = (C3229) obj;
            int i = 2;
            C3229 c32210 = c3229;
            int i2 = 2;
            while (true) {
                InterfaceC3534 interfaceC3534 = c32210.f10845;
                c32210 = interfaceC3534 instanceof C3229 ? (C3229) interfaceC3534 : null;
                if (c32210 == null) {
                    break;
                }
                i2++;
            }
            C3229 c32211 = this;
            while (true) {
                InterfaceC3534 interfaceC3535 = c32211.f10845;
                c32211 = interfaceC3535 instanceof C3229 ? (C3229) interfaceC3535 : null;
                if (c32211 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    InterfaceC4137 interfaceC4137 = this.f10844;
                    if (!AbstractC3831.m6874(c3229.mo865(interfaceC4137.getKey()), interfaceC4137)) {
                        zM6874 = false;
                        break;
                    }
                    InterfaceC3534 interfaceC3536 = this.f10845;
                    if (!(interfaceC3536 instanceof C3229)) {
                        InterfaceC4137 interfaceC4138 = (InterfaceC4137) interfaceC3536;
                        zM6874 = AbstractC3831.m6874(c3229.mo865(interfaceC4138.getKey()), interfaceC4138);
                        break;
                    }
                    this = (C3229) interfaceC3536;
                }
                if (zM6874) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10844.hashCode() + this.f10845.hashCode();
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("["), (String) mo875(new C0064(9), ""), ']');
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final /* bridge */ InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        while (true) {
            InterfaceC4137 interfaceC4137Mo865 = this.f10844.mo865(interfaceC2218);
            if (interfaceC4137Mo865 != null) {
                return interfaceC4137Mo865;
            }
            InterfaceC3534 interfaceC3534 = this.f10845;
            if (!(interfaceC3534 instanceof C3229)) {
                return interfaceC3534.mo865(interfaceC2218);
            }
            this = (C3229) interfaceC3534;
        }
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        return interfaceC5731.mo219(this.f10845.mo875(interfaceC5731, obj), this.f10844);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        InterfaceC4137 interfaceC4137 = this.f10844;
        InterfaceC4137 interfaceC4137Mo865 = interfaceC4137.mo865(interfaceC2218);
        InterfaceC3534 interfaceC3534 = this.f10845;
        if (interfaceC4137Mo865 != null) {
            return interfaceC3534;
        }
        InterfaceC3534 interfaceC3534Mo881 = interfaceC3534.mo881(interfaceC2218);
        if (interfaceC3534Mo881 == interfaceC3534) {
            return this;
        }
        return interfaceC3534Mo881 == C4794.f15814 ? interfaceC4137 : new C3229(interfaceC3534Mo881, interfaceC4137);
    }
}
