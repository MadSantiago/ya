package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥّ۠ؑٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2485 implements Iterable, InterfaceC2150 {

    /* JADX INFO: renamed from: ۦۨ */
    public final String f8277;

    public C2485(String str) {
        if (str != null) {
            this.f8277 = str;
        } else {
            C1078.m2272("StringValue cannot be null.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2485) {
            return this.f8277.equals(((C2485) obj).f8277);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8277.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0939(1, this);
    }

    public final String toString() {
        String str = this.f8277;
        return AbstractC3761.m6622(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥُ */
    public final Iterator mo1606() {
        return new C0939(0, this);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1607() {
        return this.f8277;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
  0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC2150 mo1608(String str, C1489 c1489, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        C1489 c14810;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                C1078.m2272(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strMo1607 = "undefined";
        String str3 = this.f8277;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    AbstractC1605.m3330(1, "hasOwnProperty", arrayList);
                    InterfaceC2150 interfaceC2150M4397 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                    boolean zEquals = "length".equals(interfaceC2150M4397.mo1607());
                    C0726 c0726 = InterfaceC2150.f7055;
                    if (zEquals) {
                        return c0726;
                    }
                    double dDoubleValue = interfaceC2150M4397.mo1610().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? InterfaceC2150.f7056 : c0726;
                }
                C1078.m2272("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    AbstractC1605.m3330(0, "toString", arrayList);
                    return this;
                }
                C1078.m2272("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    AbstractC1605.m3330(0, "toLocaleLowerCase", arrayList);
                    return new C2485(str3.toLowerCase());
                }
                C1078.m2272("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    AbstractC1605.m3373("charAt", 1, arrayList);
                    int iM3344 = arrayList.isEmpty() ? 0 : (int) AbstractC1605.m3344(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue());
                    return (iM3344 < 0 || iM3344 >= str3.length()) ? InterfaceC2150.f7061 : new C2485(String.valueOf(str3.charAt(iM3344)));
                }
                C1078.m2272("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(i4)).mo1607());
                        }
                        return new C2485(sb.toString());
                    }
                    return this;
                }
                C1078.m2272("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    AbstractC1605.m3330(0, "toLowerCase", arrayList);
                    return new C2485(str3.toLowerCase(Locale.ENGLISH));
                }
                C1078.m2272("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    AbstractC1605.m3373("search", 1, arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1607()).matcher(str3);
                    return matcher.find() ? new C5563(Double.valueOf(matcher.start())) : new C5563(Double.valueOf(-1.0d));
                }
                C1078.m2272("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    AbstractC1605.m3330(0, "toLocaleUpperCase", arrayList);
                    return new C2485(str3.toUpperCase());
                }
                C1078.m2272("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    AbstractC1605.m3373("lastIndexOf", 2, arrayList);
                    String strMo1608 = arrayList.size() > 0 ? ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1607() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue();
                    return new C5563(Double.valueOf(str3.lastIndexOf(strMo1608, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : AbstractC1605.m3344(dDoubleValue2)))));
                }
                C1078.m2272("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    AbstractC1605.m3330(0, "toUpperCase", arrayList);
                    return new C2485(str3.toUpperCase(Locale.ENGLISH));
                }
                C1078.m2272("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    AbstractC1605.m3330(0, "toUpperCase", arrayList);
                    return new C2485(str3.trim());
                }
                C1078.m2272("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    AbstractC1605.m3373("match", 1, arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1607()).matcher(str3);
                    return matcher2.find() ? new C1173(Arrays.asList(new C2485(matcher2.group()))) : InterfaceC2150.f7054;
                }
                C1078.m2272("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    AbstractC1605.m3373("slice", 2, arrayList);
                    double dM3344 = AbstractC1605.m3344(!arrayList.isEmpty() ? ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue() : 0.0d);
                    double dMax = dM3344 < 0.0d ? Math.max(((double) str3.length()) + dM3344, 0.0d) : Math.min(dM3344, str3.length());
                    double dM3345 = AbstractC1605.m3344(arrayList.size() > 1 ? ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new C2485(str3.substring(i5, Math.max(0, ((int) (dM3345 < 0.0d ? Math.max(((double) str3.length()) + dM3345, 0.0d) : Math.min(dM3345, str3.length()))) - i5) + i5));
                }
                C1078.m2272("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    AbstractC1605.m3373("split", 2, arrayList);
                    if (str3.length() == 0) {
                        return new C1173(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strMo1609 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1607();
                        long jM3354 = arrayList.size() > 1 ? ((long) AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue())) & 4294967295L : 2147483647L;
                        if (jM3354 == 0) {
                            return new C1173();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strMo1609), ((int) jM3354) + 1);
                        int length = strArrSplit.length;
                        if (!strMo1609.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jM3354) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new C2485(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new C1173(arrayList2);
                }
                C1078.m2272("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    AbstractC1605.m3373("substring", 2, arrayList);
                    int iM3345 = !arrayList.isEmpty() ? (int) AbstractC1605.m3344(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue()) : 0;
                    int iM3346 = arrayList.size() > 1 ? (int) AbstractC1605.m3344(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iM3345, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iM3346, 0), str3.length());
                    return new C2485(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                C1078.m2272("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    AbstractC1605.m3373("replace", 2, arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    InterfaceC2150 interfaceC2150Mo779 = InterfaceC2150.f7060;
                    if (!zIsEmpty2) {
                        strMo1607 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1607();
                        if (arrayList.size() > 1) {
                            interfaceC2150Mo779 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                        }
                    }
                    String str4 = strMo1607;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (interfaceC2150Mo779 instanceof AbstractC1079) {
                            interfaceC2150Mo779 = ((AbstractC1079) interfaceC2150Mo779).mo779(c1489, Arrays.asList(new C2485(str4), new C5563(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strMo16010 = interfaceC2150Mo779.mo1607();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new C2485(AbstractC3761.m6622(new StringBuilder(strSubstring.length() + String.valueOf(strMo16010).length() + strSubstring2.length()), strSubstring, strMo16010, strSubstring2));
                    }
                    return this;
                }
                C1078.m2272("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    AbstractC1605.m3373("indexOf", 2, arrayList);
                    if (arrayList.size() <= 0) {
                        c14810 = c1489;
                    } else {
                        c14810 = c1489;
                        strMo1607 = ((C2346) c14810.f5057).m4397(c14810, (InterfaceC2150) arrayList.get(0)).mo1607();
                    }
                    return new C5563(Double.valueOf(str3.indexOf(strMo1607, (int) AbstractC1605.m3344(arrayList.size() < 2 ? 0.0d : ((C2346) c14810.f5057).m4397(c14810, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue()))));
                }
                C1078.m2272("Command not supported");
                return null;
            default:
                C1078.m2272("Command not supported");
                return null;
        }
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean mo1609() {
        return Boolean.valueOf(!this.f8277.isEmpty());
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦٛ */
    public final Double mo1610() {
        String str = this.f8277;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC2150 mo1611() {
        return new C2485(this.f8277);
    }
}
