package p000;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦؘؕؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3254 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Set f10926;

    /* JADX INFO: renamed from: ۥۗ */
    public final Map f10927;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f10928;

    /* JADX INFO: renamed from: ۦؑ */
    public final Set f10929;

    public C3254(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f10928 = str;
        this.f10927 = map;
        this.f10926 = abstractSet;
        this.f10929 = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3254)) {
            return false;
        }
        C3254 c3254 = (C3254) obj;
        if (!this.f10928.equals(c3254.f10928) || !this.f10927.equals(c3254.f10927) || !this.f10926.equals(c3254.f10926)) {
            return false;
        }
        Set set2 = this.f10929;
        if (set2 == null || (set = c3254.f10929) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f10926.hashCode() + ((this.f10927.hashCode() + (this.f10928.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f10928);
        sb.append("',\n            |    columns = {");
        sb.append(AbstractC5568.m9389(AbstractC0973.m2055(this.f10927.values(), new C1206(14))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(AbstractC5568.m9389(this.f10926));
        sb.append("\n            |    indices = {");
        Set set = this.f10929;
        sb.append(AbstractC5568.m9389(set != null ? AbstractC0973.m2055(set, new C1206(15)) : C2340.f7777));
        sb.append("\n            |}\n        ");
        return AbstractC1098.m2325(sb.toString());
    }
}
