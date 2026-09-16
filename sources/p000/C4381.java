package p000;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: ۦٗؗؗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4381 implements Comparator {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1489 f14443;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ AbstractC1079 f14444;

    public C4381(AbstractC1079 abstractC1079, C1489 c1489) {
        this.f14444 = abstractC1079;
        this.f14443 = c1489;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2150 interfaceC2150 = (InterfaceC2150) obj;
        InterfaceC2150 interfaceC2151 = (InterfaceC2150) obj2;
        if (interfaceC2150 instanceof C4607) {
            return !(interfaceC2151 instanceof C4607) ? 1 : 0;
        }
        if (interfaceC2151 instanceof C4607) {
            return -1;
        }
        AbstractC1079 abstractC1079 = this.f14444;
        return abstractC1079 == null ? interfaceC2150.mo1607().compareTo(interfaceC2151.mo1607()) : (int) AbstractC1605.m3344(abstractC1079.mo779(this.f14443, Arrays.asList(interfaceC2150, interfaceC2151)).mo1610().doubleValue());
    }
}
