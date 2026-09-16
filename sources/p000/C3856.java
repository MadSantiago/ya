package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦَؖ٘ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3856 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f12881;

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f12885;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3702 f12884 = new C3702();

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f12883 = new ArrayList();

    /* JADX INFO: renamed from: ۥُ */
    public boolean f12882 = true;

    public C3856(ArrayList arrayList, ArrayList arrayList2) {
        this.f12881 = arrayList;
        this.f12885 = arrayList2;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static ArrayList m6891(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        if (strTrim.startsWith("|")) {
            strTrim = strTrim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strTrim.length()) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (i2 >= strTrim.length() || strTrim.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    i = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        return this.f12884;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        if (c1753.f5833.toString().contains("|")) {
            return C3714.m6571(c1753.f5831);
        }
        return null;
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2294(CharSequence charSequence) {
        if (this.f12882) {
            this.f12882 = false;
        } else {
            this.f12883.add(charSequence);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo3385(C5049 c5049) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f12885;
        int size = arrayList2.size();
        C0312 c0312 = new C0312();
        C3702 c3702 = this.f12884;
        c3702.m7114(c0312);
        AbstractC3959 c5861 = new C5861();
        c0312.m7114(c5861);
        int i = 0;
        while (true) {
            arrayList = this.f12881;
            if (i >= size) {
                break;
            }
            String str = (String) arrayList2.get(i);
            C0662 c0662 = new C0662();
            if (i < arrayList.size()) {
                c0662.f2445 = (EnumC3611) arrayList.get(i);
            }
            c5049.m8565(str.trim(), c0662);
            c0662.f2446 = true;
            c5861.m7114(c0662);
            i++;
        }
        Iterator it = this.f12883.iterator();
        AbstractC3959 c4963 = null;
        while (it.hasNext()) {
            ArrayList arrayListM6891 = m6891((CharSequence) it.next());
            AbstractC3959 c5862 = new C5861();
            int i2 = 0;
            while (i2 < size) {
                String str2 = i2 < arrayListM6891.size() ? (String) arrayListM6891.get(i2) : "";
                C0662 c0663 = new C0662();
                if (i2 < arrayList.size()) {
                    c0663.f2445 = (EnumC3611) arrayList.get(i2);
                }
                c5049.m8565(str2.trim(), c0663);
                c5862.m7114(c0663);
                i2++;
            }
            if (c4963 == null) {
                c4963 = new C4963();
                c3702.m7114(c4963);
            }
            c4963.m7114(c5862);
        }
    }
}
