package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥؘۧؐٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2886 {

    /* JADX INFO: renamed from: ۥؗ */
    public final List f9625;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f9626;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f9627;

    /* JADX INFO: renamed from: ۦؑ */
    public final List f9628;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public C2886(String str, boolean z, List list, List list2) {
        this.f9627 = str;
        this.f9626 = z;
        this.f9625 = list;
        this.f9628 = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.f9628 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2886)) {
            return false;
        }
        C2886 c2886 = (C2886) obj;
        String str = c2886.f9627;
        if (this.f9626 != c2886.f9626 || !this.f9625.equals(c2886.f9625) || !AbstractC3831.m6874(this.f9628, c2886.f9628)) {
            return false;
        }
        String str2 = this.f9627;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f9627;
        return this.f9628.hashCode() + ((this.f9625.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f9626 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f9627);
        sb.append("',\n            |   unique = '");
        sb.append(this.f9626);
        sb.append("',\n            |   columns = {");
        AbstractC1098.m2324(AbstractC0973.m2056(this.f9625, ",", null, null, null, 62));
        AbstractC1098.m2324("},");
        C2358 c2358 = C2358.f7817;
        sb.append(c2358);
        sb.append("\n            |   orders = {");
        AbstractC1098.m2324(AbstractC0973.m2056(this.f9628, ",", null, null, null, 62));
        AbstractC1098.m2324(" }");
        sb.append(c2358);
        sb.append("\n            |}\n        ");
        return AbstractC1098.m2324(AbstractC1098.m2325(sb.toString()));
    }
}
