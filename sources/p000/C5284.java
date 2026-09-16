package p000;

import android.graphics.Bitmap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦٍۜؔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5284 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2346 f17410;

    /* JADX INFO: renamed from: ۥۗ */
    public final ComponentCallbacks2C2386 f17411;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1199 f17412;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3121 f17413;

    public C5284(C1199 c1199, ComponentCallbacks2C2386 componentCallbacks2C2386, C2346 c2346) {
        this.f17412 = c1199;
        this.f17411 = componentCallbacks2C2386;
        this.f17410 = c2346;
        this.f17413 = new C3121(c1199, c2346);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0079 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a5 -> B:28:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۥؗ */
    public final java.lang.Object m8918(p000.C0117 r10, p000.C0834 r11, java.lang.Object r12, p000.C1765 r13, p000.C4931 r14, p000.AbstractC0772 r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof p000.C0375
            if (r0 == 0) goto L13
            r0 = r15
            ۥؙؚؔؒ r0 = (p000.C0375) r0
            int r1 = r0.f1389
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1389 = r1
            goto L18
        L13:
            ۥؙؚؔؒ r0 = new ۥؙؚؔؒ
            r0.<init>(r9, r15)
        L18:
            java.lang.Object r15 = r0.f1394
            int r1 = r0.f1389
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 != r3) goto L3d
            int r9 = r0.f1396
            ۦۖؗۥٖ r10 = r0.f1395
            ۥٛؓؔۙ r11 = r0.f1398
            java.lang.Object r12 = r0.f1397
            ۥًؔؒۨ r13 = r0.f1393
            ۥْؐؓۚ r14 = r0.f1391
            ۦٍۜؔۙ r1 = r0.f1392
            p000.AbstractC0186.m409(r15)
            r8 = r1
            r1 = r9
            r9 = r8
            r8 = r14
            r14 = r10
            r10 = r8
            r8 = r13
            r13 = r11
            r11 = r8
            goto La8
        L3d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r9)
            return r2
        L43:
            p000.AbstractC0186.m409(r15)
            r15 = 0
        L47:
            ۥْٟؒؖ r1 = r9.f17412
            java.util.List r1 = r10.f468
            int r4 = r1.size()
        L4f:
            if (r15 >= r4) goto L7c
            java.lang.Object r5 = r1.get(r15)
            ۦَؗۗؐ r5 = (p000.C3869) r5
            java.lang.Object r6 = r5.f12915
            ۦُ۟ؕۗ r6 = (p000.InterfaceC5349) r6
            java.lang.Object r5 = r5.f12914
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Class r7 = r12.getClass()
            boolean r5 = r5.isAssignableFrom(r7)
            if (r5 == 0) goto L79
            ۦَِۜؕ r5 = r6.mo920(r12, r13)
            if (r5 == 0) goto L79
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            ۦَؗۗؐ r1 = new ۦَؗۗؐ
            r1.<init>(r5, r15)
            goto L7d
        L79:
            int r15 = r15 + 1
            goto L4f
        L7c:
            r1 = r2
        L7d:
            if (r1 == 0) goto Lc2
            java.lang.Object r15 = r1.f12915
            ۦَِۜؕ r15 = (p000.InterfaceC5288) r15
            java.lang.Object r1 = r1.f12914
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r3
            r14.getClass()
            r0.f1392 = r9
            r0.f1391 = r10
            r0.f1393 = r11
            r0.f1397 = r12
            r0.f1398 = r13
            r0.f1395 = r14
            r0.f1396 = r1
            r0.f1389 = r3
            java.lang.Object r15 = r15.mo580(r0)
            ۥٟۚؕۨ r4 = p000.EnumC2282.f7590
            if (r15 != r4) goto La8
            return r4
        La8:
            ۦِٙؓۖ r15 = (p000.AbstractC4479) r15
            r14.getClass()     // Catch: java.lang.Throwable -> Lb2
            if (r15 == 0) goto Lb0
            return r15
        Lb0:
            r15 = r1
            goto L47
        Lb2:
            r9 = move-exception
            boolean r10 = r15 instanceof p000.C2089
            if (r10 == 0) goto Lba
            r2 = r15
            ۥۗؑؒٗ r2 = (p000.C2089) r2
        Lba:
            if (r2 == 0) goto Lc1
            ۥٌْٕ r10 = r2.f6883
            p000.AbstractC0080.m7960(r10)
        Lc1:
            throw r9
        Lc2:
            java.lang.String r9 = "Unable to create a fetcher that supports: "
            p000.C5028.m8445(r12, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5284.m8918(ۥْؐؓۚ, ۥًؔؒۨ, java.lang.Object, ۥٛؓؔۙ, ۦۖؗۥٖ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX WARN: Code duplicated, block: B:53:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0189  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0160, code lost:
    
        if (r1 == r10) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: ۥۗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8919(p000.C0834 r24, java.lang.Object r25, p000.C1765 r26, p000.C4931 r27, p000.AbstractC0772 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5284.m8919(ۥًؔؒۨ, java.lang.Object, ۥٛؓؔۙ, ۦۖؗۥٖ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[LOOP:0: B:16:0x0054->B:20:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:26:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ۥۣ */
    public final java.lang.Object m8920(p000.C2089 r8, p000.C0117 r9, p000.C0834 r10, java.lang.Object r11, p000.C1765 r12, p000.C4931 r13, p000.AbstractC0772 r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof p000.C0361
            if (r0 == 0) goto L13
            r0 = r14
            ۥؓۚؗ r0 = (p000.C0361) r0
            int r1 = r0.f1311
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1311 = r1
            goto L18
        L13:
            ۥؓۚؗ r0 = new ۥؓۚؗ
            r0.<init>(r7, r14)
        L18:
            java.lang.Object r14 = r0.f1305
            int r1 = r0.f1311
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 != r3) goto L42
            int r7 = r0.f1309
            ۦۖؗۥٖ r8 = r0.f1312
            ۥٛؓؔۙ r9 = r0.f1310
            java.lang.Object r10 = r0.f1314
            ۥًؔؒۨ r11 = r0.f1313
            ۥْؐؓۚ r12 = r0.f1308
            ۥۗؑؒٗ r13 = r0.f1306
            ۦٍۜؔۙ r1 = r0.f1307
            p000.AbstractC0186.m409(r14)
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r13
            r13 = r8
            r8 = r6
            r6 = r12
            r12 = r9
            r9 = r6
            r6 = r11
            r11 = r10
            r10 = r6
            goto L9d
        L42:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r7)
            return r2
        L48:
            p000.AbstractC0186.m409(r14)
            r14 = 0
        L4c:
            ۥْٟؒؖ r1 = r7.f17412
            java.util.List r1 = r9.f465
            int r4 = r1.size()
        L54:
            if (r14 >= r4) goto L6f
            java.lang.Object r5 = r1.get(r14)
            ۦِۣؗٚ r5 = (p000.InterfaceC5619) r5
            ۥؚؗؗ r5 = r5.mo3837(r8, r12)
            if (r5 == 0) goto L6c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            ۦَؗۗؐ r1 = new ۦَؗۗؐ
            r1.<init>(r5, r14)
            goto L70
        L6c:
            int r14 = r14 + 1
            goto L54
        L6f:
            r1 = r2
        L70:
            if (r1 == 0) goto Lc0
            java.lang.Object r14 = r1.f12915
            ۥؚؗؗ r14 = (p000.InterfaceC0633) r14
            java.lang.Object r1 = r1.f12914
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r3
            r13.getClass()
            r0.f1307 = r7
            r0.f1306 = r8
            r0.f1308 = r9
            r0.f1313 = r10
            r0.f1314 = r11
            r0.f1310 = r12
            r0.f1312 = r13
            r0.f1309 = r1
            r0.f1311 = r3
            java.lang.Object r14 = r14.mo1409(r0)
            ۥٟۚؕۨ r4 = p000.EnumC2282.f7590
            if (r14 != r4) goto L9d
            return r4
        L9d:
            ۦْۜؗۢ r14 = (p000.C5303) r14
            r13.getClass()
            if (r14 == 0) goto Lbe
            ۦۦًؗٞ r7 = new ۦۦًؗٞ
            android.graphics.drawable.Drawable r9 = r14.f17471
            boolean r10 = r14.f17470
            int r11 = r8.f6881
            ۥٌْٕ r8 = r8.f6883
            boolean r12 = r8 instanceof p000.C4798
            if (r12 == 0) goto Lb5
            ۦٞؕٓۤ r8 = (p000.C4798) r8
            goto Lb6
        Lb5:
            r8 = r2
        Lb6:
            if (r8 == 0) goto Lba
            java.lang.String r2 = r8.f15825
        Lba:
            r7.<init>(r9, r10, r11, r2)
            return r7
        Lbe:
            r14 = r1
            goto L4c
        Lc0:
            java.lang.String r7 = "Unable to create a decoder that supports: "
            p000.C5028.m8445(r11, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5284.m8920(ۥۗؑؒٗ, ۥْؐؓۚ, ۥًؔؒۨ, java.lang.Object, ۥٛؓؔۙ, ۦۖؗۥٖ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: ۦؑ */
    public final Object m8921(C4562 c4562, AbstractC0772 abstractC0772) throws Throwable {
        C2491 c2491;
        Object objM2592;
        C5284 c5284 = this;
        C4562 c4563 = c4562;
        C3121 c3121 = c5284.f17413;
        if (abstractC0772 instanceof C2491) {
            c2491 = (C2491) abstractC0772;
            int i = c2491.f8288;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2491.f8288 = i - Integer.MIN_VALUE;
            } else {
                c2491 = new C2491(c5284, abstractC0772);
            }
        } else {
            c2491 = new C2491(c5284, abstractC0772);
        }
        C2491 c2492 = c2491;
        Object obj = c2492.f8286;
        int i2 = c2492.f8288;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            try {
                C0834 c0834 = c4563.f15069;
                Object obj2 = c0834.f2961;
                C0181 c0181 = c4563.f15065;
                Bitmap.Config config = AbstractC0080.f15150;
                C4931 c4931 = c4563.f15066;
                C1765 c1765M4400 = c5284.f17410.m4400(c0834, c0181);
                int i3 = c1765M4400.f5877;
                List list = c5284.f17412.f4130.f466;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C3869 c3869 = (C3869) list.get(i4);
                    C1227 c1227 = (C1227) c3869.f12915;
                    if (((Class) c3869.f12914).isAssignableFrom(obj2.getClass()) && (objM2592 = c1227.m2592(obj2, c1765M4400)) != null) {
                        obj2 = objM2592;
                    }
                }
                C5772 c5772M5750 = c3121.m5750(c0834, obj2, c1765M4400, c4931);
                C2431 c2431M5745 = c5772M5750 != null ? c3121.m5745(c0834, c5772M5750, c0181, i3) : null;
                if (c2431M5745 != null) {
                    return C3121.m5734(c4563, c0834, c5772M5750, c2431M5745);
                }
                AbstractC2132 abstractC2132 = c0834.f2970;
                C4522 c4522 = new C4522(c5284, c0834, obj2, c1765M4400, c4931, c5772M5750, c4563, (InterfaceC0443) null);
                c2492.f8285 = c5284;
                c2492.f8284 = c4563;
                c2492.f8288 = 1;
                Object objM5144 = AbstractC2765.m5144(abstractC2132, c4522, c2492);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                return objM5144 == enumC2282 ? enumC2282 : objM5144;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4562 c4564 = c2492.f8284;
            C5284 c5285 = c2492.f8285;
            try {
                AbstractC0186.m409(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c4563 = c4564;
                c5284 = c5285;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        C2346 c2346 = c5284.f17410;
        return C2346.m4394(c4563.f15069, th);
    }
}
