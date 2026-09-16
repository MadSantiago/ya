package p000;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۦٍؑۜٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3757 {

    /* JADX INFO: renamed from: ۦؚ */
    public static final String[] f12507 = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: ۥؗ */
    public final LinkedHashMap f12508;

    /* JADX INFO: renamed from: ۥُ */
    public final C0037 f12509;

    /* JADX INFO: renamed from: ۥۗ */
    public final LinkedHashMap f12511;

    /* JADX INFO: renamed from: ۥۜ */
    public final C1405 f12512;

    /* JADX INFO: renamed from: ۥۣ */
    public final WorkDatabase_Impl f12513;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f12514;

    /* JADX INFO: renamed from: ۦٛ */
    public final C3121 f12516;

    /* JADX INFO: renamed from: ۦۙ */
    public final String[] f12518;

    /* JADX INFO: renamed from: ۦِ */
    public final AtomicBoolean f12515 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۦۗ */
    public InterfaceC4448 f12517 = new C0062(25);

    /* JADX INFO: renamed from: ۥّ */
    public final LinkedHashMap f12510 = new LinkedHashMap();

    public C3757(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, C0037 c0037) {
        this.f12513 = workDatabase_Impl;
        this.f12511 = linkedHashMap;
        this.f12508 = linkedHashMap2;
        this.f12514 = z;
        this.f12509 = c0037;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            this.f12510.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.f12511.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.f12518 = strArr2;
        for (Map.Entry entry : this.f12511.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.f12510.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap3 = this.f12510;
                linkedHashMap3.put(lowerCase4, AbstractC4554.m7912(lowerCase3, linkedHashMap3));
            }
        }
        this.f12512 = new C1405(this.f12518.length);
        this.f12516 = new C3121(this.f12518.length);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6607(InterfaceC4448 interfaceC4448, InterfaceC4448 interfaceC4449) {
        if (this.f12515.compareAndSet(false, true)) {
            interfaceC4448.mo449();
            C3950 c3950 = this.f12513.f254;
            InterfaceC0443 interfaceC0443 = null;
            if (c3950 == null) {
                c3950 = null;
            }
            AbstractC2765.m5135(c3950, new C3023(C3023.f10184), 0, new C5030(this, interfaceC4449, interfaceC0443, 21), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:19:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۥُ */
    public final java.lang.Object m6608(p000.InterfaceC0238 r8, int r9, p000.AbstractC0772 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p000.C3301
            if (r0 == 0) goto L13
            r0 = r10
            ۦؙؕؗۧ r0 = (p000.C3301) r0
            int r1 = r0.f11047
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11047 = r1
            goto L18
        L13:
            ۦؙؕؗۧ r0 = new ۦؙؕؗۧ
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f11048
            int r1 = r0.f11047
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.f11051
            int r8 = r0.f11050
            java.lang.String[] r9 = r0.f11046
            java.lang.String r1 = r0.f11044
            ۥٗٙۤ r3 = r0.f11045
            p000.AbstractC0186.m409(r10)
            r10 = r9
            r9 = r3
            goto L81
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r7)
            r7 = 0
            return r7
        L38:
            p000.AbstractC0186.m409(r10)
            java.lang.String[] r7 = r7.f12518
            r7 = r7[r9]
            java.lang.String[] r9 = p000.C3757.f12507
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L83
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = p000.AbstractC5078.m8669(r5, r4, r3)
            r0.f11045 = r9
            r0.f11044 = r1
            r0.f11046 = r10
            r0.f11050 = r8
            r0.f11051 = r7
            r0.f11047 = r2
            java.lang.Object r3 = p000.AbstractC4593.m7990(r9, r3, r0)
            ۥٟۚؕۨ r4 = p000.EnumC2282.f7590
            if (r3 != r4) goto L81
            return r4
        L81:
            int r8 = r8 + r2
            goto L4a
        L83:
            ۥۜؑؒؑ r7 = p000.C2358.f7817
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3757.m6608(ۥؒؒؐۦ, int, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥّ */
    public final Object m6609(AbstractC0772 abstractC0772) throws Throwable {
        C0966 c0966;
        C5002 c5002;
        if (abstractC0772 instanceof C0966) {
            c0966 = (C0966) abstractC0772;
            int i = c0966.f3411;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0966.f3411 = i - Integer.MIN_VALUE;
            } else {
                c0966 = new C0966(this, abstractC0772);
            }
        } else {
            c0966 = new C0966(this, abstractC0772);
        }
        Object obj = c0966.f3408;
        int i2 = c0966.f3411;
        InterfaceC0443 interfaceC0443 = null;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            WorkDatabase_Impl workDatabase_Impl = this.f12513;
            C5002 c5003 = workDatabase_Impl.f251;
            if (c5003.m8403()) {
                try {
                    C2194 c2194 = new C2194(this, interfaceC0443, 2);
                    c0966.f3409 = c5003;
                    c0966.f3411 = 1;
                    Object objM84 = workDatabase_Impl.m84(false, c2194, c0966);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM84 == enumC2282) {
                        return enumC2282;
                    }
                    c5002 = c5003;
                    c5002.m8412();
                } catch (Throwable th) {
                    th = th;
                    c5002 = c5003;
                    c5002.m8412();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5002 = c0966.f3409;
            try {
                AbstractC0186.m409(obj);
                c5002.m8412();
            } catch (Throwable th2) {
                th = th2;
                c5002.m8412();
                throw th;
            }
        }
        return C2358.f7817;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m6610(AbstractC0772 abstractC0772) throws Throwable {
        C1128 c1128;
        C5002 c5002;
        Throwable th;
        C5002 c5003;
        Object value;
        int[] iArr;
        if (abstractC0772 instanceof C1128) {
            c1128 = (C1128) abstractC0772;
            int i = c1128.f3961;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1128.f3961 = i - Integer.MIN_VALUE;
            } else {
                c1128 = new C1128(this, abstractC0772);
            }
        } else {
            c1128 = new C1128(this, abstractC0772);
        }
        Object objM84 = c1128.f3959;
        int i2 = c1128.f3961;
        InterfaceC0443 interfaceC0443 = null;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC0186.m409(objM84);
            WorkDatabase_Impl workDatabase_Impl = this.f12513;
            c5002 = workDatabase_Impl.f251;
            boolean zM8403 = c5002.m8403();
            C1590 c1590 = C1590.f5346;
            if (!zM8403) {
                return c1590;
            }
            try {
                if (!this.f12515.compareAndSet(true, false)) {
                    c5002.m8412();
                    return c1590;
                }
                if (!((Boolean) this.f12517.mo449()).booleanValue()) {
                    c5002.m8412();
                    return c1590;
                }
                C2194 c2194 = new C2194(this, interfaceC0443, i3);
                c1128.f3958 = this;
                c1128.f3957 = c5002;
                c1128.f3961 = 1;
                objM84 = workDatabase_Impl.m84(false, c2194, c1128);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM84 == enumC2282) {
                    return enumC2282;
                }
            } catch (Throwable th2) {
                th = th2;
                c5003 = c5002;
                c5003.m8412();
                throw th;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5003 = c1128.f3957;
            C3757 c3757 = c1128.f3958;
            try {
                AbstractC0186.m409(objM84);
                c5002 = c5003;
                this = c3757;
            } catch (Throwable th3) {
                th = th3;
                c5003.m8412();
                throw th;
            }
        }
        Set set = (Set) objM84;
        if (!set.isEmpty()) {
            C3121 c3121 = this.f12516;
            try {
                if (!set.isEmpty()) {
                    C4994 c4994 = (C4994) c3121.f10451;
                    do {
                        value = c4994.getValue();
                        int[] iArr2 = (int[]) value;
                        int length = iArr2.length;
                        iArr = new int[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                        }
                    } while (!c4994.m8386(value, iArr));
                }
                this.f12509.mo211(set);
            } catch (Throwable th4) {
                th = th4;
                c5003 = c5002;
                c5003.m8412();
                throw th;
            }
        }
        c5002.m8412();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m6611(InterfaceC1550 interfaceC1550, AbstractC0772 abstractC0772) {
        C5751 c5751;
        if (abstractC0772 instanceof C5751) {
            c5751 = (C5751) abstractC0772;
            int i = c5751.f18968;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5751.f18968 = i - Integer.MIN_VALUE;
            } else {
                c5751 = new C5751(this, abstractC0772);
            }
        } else {
            c5751 = new C5751(this, abstractC0772);
        }
        Object objMo467 = c5751.f18965;
        int i2 = c5751.f18968;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(objMo467);
            C1657 c1657 = new C1657(29);
            c5751.f18966 = interfaceC1550;
            c5751.f18968 = 1;
            objMo467 = interfaceC1550.mo467("SELECT * FROM room_table_modification_log WHERE invalidated = 1", c1657, c5751);
            if (objMo467 != enumC2282) {
            }
            return enumC2282;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) c5751.f18966;
            AbstractC0186.m409(objMo467);
            return set;
        }
        interfaceC1550 = (InterfaceC1550) c5751.f18966;
        AbstractC0186.m409(objMo467);
        Set set2 = (Set) objMo467;
        if (!set2.isEmpty()) {
            c5751.f18966 = set2;
            c5751.f18968 = 2;
            if (AbstractC4593.m7990(interfaceC1550, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c5751) == enumC2282) {
                return enumC2282;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (p000.AbstractC4593.m7990(r13, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        r13 = r13;
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e1 -> B:28:0x00e4). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۦؑ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6612(p000.InterfaceC0238 r13, int r14, p000.AbstractC0772 r15) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3757.m6612(ۥؒؒؐۦ, int, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C3869 m6613(String[] strArr) {
        C0232 c0232 = new C0232();
        for (String str : strArr) {
            Set set = (Set) this.f12508.get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                c0232.addAll(set);
            } else {
                c0232.add(str);
            }
        }
        String[] strArr2 = (String[]) C4773.m8152(c0232).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) this.f12510.get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                C1078.m2272("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new C3869(strArr2, iArr);
    }
}
