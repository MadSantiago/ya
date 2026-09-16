package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥؘِؑۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1079 implements InterfaceC2150, InterfaceC4687 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final HashMap f3771 = new HashMap();

    /* JADX INFO: renamed from: ۦۨ */
    public final String f3772;

    public AbstractC1079(String str) {
        this.f3772 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1079)) {
            return false;
        }
        AbstractC1079 abstractC1079 = (AbstractC1079) obj;
        String str = this.f3772;
        if (str != null) {
            return str.equals(abstractC1079.f3772);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3772;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥُ */
    public final Iterator mo1606() {
        return new C1190(this.f3771.keySet().iterator());
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1607() {
        return this.f3772;
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC2150 mo1608(String str, C1489 c1489, ArrayList arrayList) {
        return "toString".equals(str) ? new C2485(this.f3772) : InterfaceC4687.m8033(this, new C2485(str), c1489, arrayList);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract InterfaceC2150 mo779(C1489 c1489, List list);

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean mo1609() {
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC4687
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC2150 mo2281(String str) {
        HashMap map = this.f3771;
        return map.containsKey(str) ? (InterfaceC2150) map.get(str) : InterfaceC2150.f7060;
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦٛ */
    public final Double mo1610() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p000.InterfaceC4687
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo2282(String str) {
        return this.f3771.containsKey(str);
    }

    @Override // p000.InterfaceC4687
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo2283(String str, InterfaceC2150 interfaceC2150) {
        HashMap map = this.f3771;
        if (interfaceC2150 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2150);
        }
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public InterfaceC2150 mo1611() {
        return this;
    }
}
