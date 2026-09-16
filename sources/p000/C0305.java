package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥًؘؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0305 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f1098;

    /* JADX INFO: renamed from: ۥُ */
    public final List f1099;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f1100;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f1101;

    /* JADX INFO: renamed from: ۦؑ */
    public final List f1102;

    public C0305(String str, String str2, String str3, List list, List list2) {
        this.f1101 = str;
        this.f1100 = str2;
        this.f1098 = str3;
        this.f1102 = list;
        this.f1099 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0305)) {
            return false;
        }
        C0305 c0305 = (C0305) obj;
        if (AbstractC3831.m6874(this.f1101, c0305.f1101) && AbstractC3831.m6874(this.f1100, c0305.f1100) && AbstractC3831.m6874(this.f1098, c0305.f1098) && this.f1102.equals(c0305.f1102)) {
            return this.f1099.equals(c0305.f1099);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1099.hashCode() + ((this.f1102.hashCode() + AbstractC5078.m8674(AbstractC5078.m8674(this.f1101.hashCode() * 31, 31, this.f1100), 31, this.f1098)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f1101);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.f1100);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.f1098);
        sb.append("',\n            |   columnNames = {");
        AbstractC1098.m2324(AbstractC0973.m2056(AbstractC0973.m2042(this.f1102), ",", null, null, null, 62));
        AbstractC1098.m2324("},");
        C2358 c2358 = C2358.f7817;
        sb.append(c2358);
        sb.append("\n            |   referenceColumnNames = {");
        AbstractC1098.m2324(AbstractC0973.m2056(AbstractC0973.m2042(this.f1099), ",", null, null, null, 62));
        AbstractC1098.m2324(" }");
        sb.append(c2358);
        sb.append("\n            |}\n        ");
        return AbstractC1098.m2324(AbstractC1098.m2325(sb.toString()));
    }
}
