package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦٜۚؓٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5162 implements InterfaceC2150, InterfaceC4687 {

    /* JADX INFO: renamed from: ۦۨ */
    public final HashMap f17096 = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5162) {
            return this.f17096.equals(((C5162) obj).f17096);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17096.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f17096;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥُ */
    public final Iterator mo1606() {
        return new C1190(this.f17096.keySet().iterator());
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1607() {
        return "[object Object]";
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    public InterfaceC2150 mo1608(String str, C1489 c1489, ArrayList arrayList) {
        return "toString".equals(str) ? new C2485(toString()) : InterfaceC4687.m8033(this, new C2485(str), c1489, arrayList);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean mo1609() {
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC4687
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC2150 mo2281(String str) {
        HashMap map = this.f17096;
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
        return this.f17096.containsKey(str);
    }

    @Override // p000.InterfaceC4687
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo2283(String str, InterfaceC2150 interfaceC2150) {
        HashMap map = this.f17096;
        if (interfaceC2150 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2150);
        }
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC2150 mo1611() {
        C5162 c5162 = new C5162();
        for (Map.Entry entry : this.f17096.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC4687;
            HashMap map = c5162.f17096;
            if (z) {
                map.put((String) entry.getKey(), (InterfaceC2150) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC2150) entry.getValue()).mo1611());
            }
        }
        return c5162;
    }
}
