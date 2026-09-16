package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥؙؔؕٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0719 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final float f2628 = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb A[LOOP:0: B:26:0x00b6->B:30:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4 A[EDGE_INSN: B:68:0x00d4->B:32:0x00d4 BREAK  A[LOOP:0: B:26:0x00b6->B:30:0x00cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015f -> B:62:0x0165). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۥؗ */
    public static final java.lang.Object m1587(p000.C5475 r18, long r19, p000.C4164 r21, p000.AbstractC2870 r22) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0719.m1587(ۦٜٖۡؕ, long, ۦْٕٔؒ, ۥۧؔۡؗ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean m1588(C5639 c5639, long j) {
        Object obj;
        List list = c5639.f18583;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (AbstractC5378.m9062(((C3536) obj).f11732, j)) {
                break;
            }
            i++;
        }
        C3536 c3536 = (C3536) obj;
        if (c3536 != null && c3536.f11733) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final float m1589(InterfaceC2509 interfaceC2509, int i) {
        return i == 2 ? interfaceC2509.mo3257() * f2628 : interfaceC2509.mo3257();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [ۦؙۡؒۘ] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX INFO: renamed from: ۥۗ */
    public static final Object m1590(C5475 c5475, long j, AbstractC0772 abstractC0772) {
        C2060 c2060;
        Object obj;
        C3536 c3536;
        C5662 c5662;
        if (abstractC0772 instanceof C2060) {
            c2060 = (C2060) abstractC0772;
            int i = c2060.f6785;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2060.f6785 = i - Integer.MIN_VALUE;
            } else {
                c2060 = new C2060(abstractC0772);
            }
        } else {
            c2060 = new C2060(abstractC0772);
        }
        Object obj2 = c2060.f6784;
        int i2 = c2060.f6785;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj2);
                if (!m1588(c5475.f18065.f8120, j)) {
                    List list = c5475.f18065.f8120.f18583;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (AbstractC5378.m9062(((C3536) obj).f11732, j)) {
                            break;
                        }
                        i3++;
                    }
                    c3536 = (C3536) obj;
                    if (c3536 != null) {
                        C5450 c5450 = new C5450();
                        C5450 c5451 = new C5450();
                        c5451.f17965 = c3536;
                        long jMo3252 = c5475.m9175().mo3252();
                        C5662 c5663 = new C5662();
                        InterfaceC5731 c4372 = new C4372(c5663, c5451, c5450, null);
                        c2060.f6782 = c3536;
                        c2060.f6781 = c5450;
                        c2060.f6783 = c5663;
                        c2060.f6785 = 1;
                        Object objM9174 = c5475.m9174(jMo3252, c4372, c2060);
                        Object obj3 = EnumC2282.f7590;
                        if (objM9174 == obj3) {
                            return obj3;
                        }
                        c5662 = c5663;
                        j = c5450;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5662 = c2060.f6783;
            C5450 c5452 = c2060.f6781;
            c3536 = c2060.f6782;
            AbstractC0186.m409(obj2);
            j = c5452;
            if (c5662.f18631) {
                C3536 c3537 = (C3536) j.f17965;
                return c3537 == null ? c3536 : c3537;
            }
            return null;
        } catch (C4491 unused) {
            C3536 c3538 = (C3536) j.f17965;
            return c3538 == null ? c3536 : c3538;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۥۣ */
    public static final java.lang.Object m1591(p000.C5475 r12, long r13, p000.AbstractC0772 r15) {
        /*
            boolean r0 = r15 instanceof p000.C2683
            if (r0 == 0) goto L13
            r0 = r15
            ۥؘۤؖؕ r0 = (p000.C2683) r0
            int r1 = r0.f8904
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8904 = r1
            goto L18
        L13:
            ۥؘۤؖؕ r0 = new ۥؘۤؖؕ
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f8903
            int r1 = r0.f8904
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            ۥٔؑۤٔ r12 = r0.f8901
            ۦٜٖۡؕ r13 = r0.f8902
            p000.AbstractC0186.m409(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r12)
            return r3
        L33:
            p000.AbstractC0186.m409(r15)
            ۥْٖ۟ؓ r15 = r12.f18065
            ۦۤؑۗٛ r15 = r15.f8120
            boolean r15 = m1588(r15, r13)
            if (r15 == 0) goto L42
            goto Lc2
        L42:
            ۥٔؑۤٔ r15 = new ۥٔؑۤٔ
            r15.<init>()
            r15.f4535 = r13
        L49:
            r0.f8902 = r12
            r0.f8901 = r15
            r0.f8904 = r2
            ۦَِؒۖ r13 = p000.EnumC3834.f12724
            java.lang.Object r13 = r12.m9172(r13, r0)
            ۥٟۚؕۨ r14 = p000.EnumC2282.f7590
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            ۦۤؑۗٛ r15 = (p000.C5639) r15
            java.util.List r14 = r15.f18583
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            ۦؙؓۘ r7 = (p000.C3536) r7
            long r7 = r7.f11732
            long r9 = r13.f4535
            boolean r7 = p000.AbstractC5378.m9062(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            ۦؙؓۘ r6 = (p000.C3536) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = p000.AbstractC3801.m6754(r6)
            if (r14 == 0) goto Lad
            java.util.List r14 = r15.f18583
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            ۦؙؓۘ r5 = (p000.C3536) r5
            boolean r5 = r5.f11733
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            ۦؙؓۘ r1 = (p000.C3536) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.f11732
            r13.f4535 = r14
            goto Lc3
        Lad:
            long r14 = p000.AbstractC3801.m6747(r6, r2)
            r4 = 0
            boolean r14 = p000.C1553.m3306(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.m6326()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0719.m1591(ۦٜٖۡؕ, long, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۦؑ */
    public static final java.lang.Object m1592(p000.C5475 r4, long r5, p000.InterfaceC4745 r7, p000.AbstractC0772 r8) {
        /*
            boolean r0 = r8 instanceof p000.C0342
            if (r0 == 0) goto L13
            r0 = r8
            ۥؓؗٞۥ r0 = (p000.C0342) r0
            int r1 = r0.f1269
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1269 = r1
            goto L18
        L13:
            ۥؓؗٞۥ r0 = new ۥؓؗٞۥ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1268
            int r1 = r0.f1269
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            ۦٌُٝؔ r4 = r0.f1266
            ۦٜٖۡؕ r5 = r0.f1267
            p000.AbstractC0186.m409(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r4)
            r4 = 0
            return r4
        L32:
            p000.AbstractC0186.m409(r8)
        L35:
            r0.f1267 = r4
            r0.f1266 = r7
            r0.f1269 = r2
            java.lang.Object r8 = m1591(r4, r5, r0)
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r8 != r5) goto L44
            return r5
        L44:
            ۦؙؓۘ r8 = (p000.C3536) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = p000.AbstractC3801.m6754(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.mo211(r8)
            long r5 = r8.f11732
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0719.m1592(ۦٜٖۡؕ, long, ۦٌُٝؔ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x044c -> B:92:0x03fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x048a -> B:165:0x05fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05e5 -> B:162:0x05ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x060f -> B:166:0x05fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x067b -> B:180:0x0683). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x024a -> B:32:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02ec -> B:32:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0346 -> B:78:0x03b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x03a0 -> B:75:0x03a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18821. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۦۙ */
    public static final java.lang.Object m1593(p000.C5475 r28, p000.C3536 r29, p000.C0062 r30, p000.C3032 r31, p000.C4164 r32, p000.C1374 r33, p000.C0091 r34, p000.AbstractC2870 r35) {
        /*
            Method dump skipped, instruction units count: 1882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0719.m1593(ۦٜٖۡؕ, ۦؙؓۘ, ۦؚ, ۦًؑؔٞ, ۦْٕٔؒ, ۥِٔۜ, ۦۜ, ۥۧؔۡؗ):java.lang.Object");
    }
}
