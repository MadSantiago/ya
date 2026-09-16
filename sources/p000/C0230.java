package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥؒؐۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0230 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0230 f872 = new C0230();

    /* JADX INFO: renamed from: ۥۗ */
    public static final Map f871 = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: ۥۣ */
    public static C0579 m492(EnumC1499 enumC1499) {
        Object obj = f871.get(enumC1499);
        if (obj != null) {
            return (C0579) obj;
        }
        C5028.m8446(enumC1499, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:21:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۥۗ */
    public final java.lang.Object m493(p000.AbstractC0772 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p000.C4059
            if (r0 == 0) goto L13
            r0 = r9
            ۦْؑٔ r0 = (p000.C4059) r0
            int r1 = r0.f13522
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13522 = r1
            goto L18
        L13:
            ۦْؑٔ r0 = new ۦْؑٔ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r8 = r0.f13523
            int r9 = r0.f13522
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L36
            if (r9 != r2) goto L30
            java.lang.Object r9 = r0.f13526
            java.util.Map r3 = r0.f13525
            ۥٗؑؔۦ r4 = r0.f13521
            java.util.Iterator r5 = r0.f13519
            java.util.Map r6 = r0.f13520
            p000.AbstractC0186.m409(r8)
            goto L8d
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r8)
            return r1
        L36:
            p000.AbstractC0186.m409(r8)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            java.util.Map r9 = p000.C0230.f871
            int r3 = r9.size()
            int r3 = p000.AbstractC4554.m7911(r3)
            r8.<init>(r3)
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r3 = r8
            r5 = r9
        L54:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto La2
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r4 = r8.getKey()
            ۥٗؑؔۦ r4 = (p000.EnumC1499) r4
            java.lang.Object r8 = r8.getValue()
            ۥَٖؗؑ r8 = (p000.C0579) r8
            ۦۨ r6 = new ۦۨ
            r7 = 14
            r6.<init>(r7, r8)
            r0.f13520 = r3
            r0.f13519 = r5
            r0.f13521 = r4
            r0.f13525 = r3
            r0.f13526 = r9
            r0.f13522 = r2
            java.lang.Object r8 = p000.AbstractC4554.m7909(r6, r0)
            ۥٟۚؕۨ r6 = p000.EnumC2282.f7590
            if (r8 != r6) goto L8c
            return r6
        L8c:
            r6 = r3
        L8d:
            ۥَٖؗؑ r8 = m492(r4)
            ۥؙِۤ r8 = r8.f2072
            if (r8 == 0) goto L9a
            r3.put(r9, r8)
            r3 = r6
            goto L54
        L9a:
            java.lang.String r8 = "Subscriber "
            java.lang.String r9 = " has not been registered."
            p000.C5028.m8446(r4, r9, r8)
            return r1
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0230.m493(ۥؚؒۥؔ):java.lang.Object");
    }
}
