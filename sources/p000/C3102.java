package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۦؒؓۙٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3102 extends AbstractC2109 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f10394;

    /* JADX INFO: renamed from: ۥُ */
    public final C3639 f10395;

    /* JADX INFO: renamed from: ۥّ */
    public final C4852 f10396;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f10397;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f10398;

    /* JADX INFO: renamed from: ۦؑ */
    public HashSet f10399;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ C5362 f10400;

    public C3102(C5362 c5362, long j, boolean z, boolean z2, C4228 c4228) {
        this.f10400 = c5362;
        this.f10398 = j;
        this.f10397 = z;
        this.f10394 = z2;
        C3639 c3639 = AbstractC5705.f18789;
        this.f10395 = new C3639();
        this.f10396 = new C4852(C2103.f6923, C1397.f4792);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo4090() {
        this.f10400.f17642--;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC1663 mo990(C5285 c5285) {
        return this.f10400.f17659.mo990(c5285);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo991() {
        return this.f10397;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo992() {
        return this.f10394;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥْ */
    public final void mo993(C5863 c5863) {
        this.f10400.f17659.mo993(c5863);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo994(C1946 c1946) {
        this.f10400.f17659.mo994(c1946);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo4091() {
        this.f10400.f17642++;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۖ */
    public final void m5687() {
        C3639 c3639 = this.f10395;
        if (c3639.m6494()) {
            HashSet hashSet = this.f10399;
            if (hashSet != null) {
                Object[] objArr = c3639.f12174;
                long[] jArr = c3639.f12175;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C5362 c5362 = (C5362) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(c5362.m8973());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            c3639.m6493();
        }
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥۗ */
    public final C3639 mo997(C1946 c1946, InterfaceC0557 interfaceC0557, InterfaceC5731 interfaceC5731) {
        return this.f10400.f17659.mo997(c1946, interfaceC0557, interfaceC5731);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC5601 mo999() {
        return this.f10400.f17661;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1000(C1946 c1946, InterfaceC5731 interfaceC5731) {
        this.f10400.f17659.mo1000(c1946, interfaceC5731);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo1003() {
        return this.f10400.f17659.mo1003();
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo1006(C1946 c1946) {
        C5362 c5362 = this.f10400;
        AbstractC2109 abstractC2109 = c5362.f17659;
        abstractC2109.mo1006(c5362.f17661);
        abstractC2109.mo1006(c1946);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦٌ */
    public final AbstractC1075 mo1007(AbstractC0210 abstractC0210) {
        return this.f10400.f17659.mo1007(abstractC0210);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC3534 mo1009() {
        return this.f10400.f17659.mo1009();
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦٗ */
    public final void mo4092(C5362 c5362) {
        HashSet hashSet = this.f10399;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(c5362.m8973());
            }
        }
        if (c5362 != null) {
            this.f10395.m6497(c5362);
        }
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦٛ */
    public final C2103 mo4093() {
        return (C2103) this.f10396.getValue();
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo1013() {
        return this.f10400.f17659.mo1013();
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۙ */
    public final long mo1014() {
        return this.f10398;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۚ */
    public final C3639 mo1015(C1946 c1946, InterfaceC0557 interfaceC0557, C3639 c3639) {
        return this.f10400.f17659.mo1015(c1946, interfaceC0557, c3639);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo1016(C1946 c1946) {
        this.f10400.f17659.mo1016(c1946);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo4094(C5362 c5362) {
        this.f10395.m6495(c5362);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo1017(Set set) {
        HashSet hashSet = this.f10399;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f10399 = hashSet;
        }
        hashSet.add(set);
    }
}
