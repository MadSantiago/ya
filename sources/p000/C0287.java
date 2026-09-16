package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۥٍؒۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0287 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f1068 = AbstractC2133.m4128();

    /* JADX INFO: renamed from: ۥۗ */
    public final LinkedHashSet f1067 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥؗ */
    public final LinkedHashMap f1065 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۦؑ */
    public final LinkedHashSet f1069 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayList f1066 = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0287)) {
            return false;
        }
        return this.f1068.equals(((C0287) obj).f1068);
    }

    public final int hashCode() {
        return this.f1068.hashCode();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m609(AbstractC4766 abstractC4766) {
        C0114 c0114 = abstractC4766.f15717;
        C3131 c3131 = c0114.f457;
        C4093 c4093 = c0114.f456;
        StringBuilder sb = new StringBuilder(AbstractC2919.m5505(c3131));
        sb.append(':');
        sb.append(c4093 != null ? c4093.f13661 : "");
        sb.append(':');
        sb.append(C1489.f5055);
        this.f1065.put(sb.toString(), abstractC4766);
    }
}
