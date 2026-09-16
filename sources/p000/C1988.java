package p000;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥٟؑۚٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1988 implements InterfaceC1508 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC5823 f6561;

    /* JADX INFO: renamed from: ۥُ */
    public final AtomicBoolean f6562 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۥّ */
    public final C1387 f6563 = new C1387();

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0999 f6564;

    /* JADX INFO: renamed from: ۥۣ */
    public final File f6565;

    /* JADX INFO: renamed from: ۦؑ */
    public final C5285 f6566;

    public C1988(File file, InterfaceC0999 interfaceC0999, InterfaceC5823 interfaceC5823, C5285 c5285) {
        this.f6565 = file;
        this.f6564 = interfaceC0999;
        this.f6561 = interfaceC5823;
        this.f6566 = c5285;
    }

    @Override // p000.InterfaceC1508
    public final void close() {
        this.f6562.set(true);
        this.f6566.mo449();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cc A[Catch: all -> 0x0108, IOException -> 0x010a, TRY_ENTER, TryCatch #0 {IOException -> 0x010a, blocks: (B:43:0x00cc, B:45:0x00d2, B:48:0x00e7, B:49:0x0107, B:56:0x0113, B:63:0x0120, B:62:0x011d), top: B:73:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2 A[Catch: all -> 0x0108, IOException -> 0x010a, TRY_LEAVE, TryCatch #0 {IOException -> 0x010a, blocks: (B:43:0x00cc, B:45:0x00d2, B:48:0x00e7, B:49:0x0107, B:56:0x0113, B:63:0x0120, B:62:0x011d), top: B:73:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[Catch: all -> 0x0108, IOException -> 0x010a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x010a, blocks: (B:43:0x00cc, B:45:0x00d2, B:48:0x00e7, B:49:0x0107, B:56:0x0113, B:63:0x0120, B:62:0x011d), top: B:73:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m3890(C3540 c3540, AbstractC0772 abstractC0772) {
        C0423 c0423;
        File file;
        InterfaceC3087 interfaceC3087;
        InterfaceC5731 interfaceC5731;
        C3575 c3575;
        Throwable th;
        C3575 c3576;
        C1988 c1988;
        File file2;
        if (abstractC0772 instanceof C0423) {
            c0423 = (C0423) abstractC0772;
            int i = c0423.f1531;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0423.f1531 = i - Integer.MIN_VALUE;
            } else {
                c0423 = new C0423(this, abstractC0772);
            }
        } else {
            c0423 = new C0423(this, abstractC0772);
        }
        Object obj = c0423.f1533;
        int i2 = c0423.f1531;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            AbstractC0186.m409(obj);
                            if (this.f6562.get()) {
                                C1078.m2276("StorageConnection has already been disposed.");
                                return null;
                            }
                            File file3 = this.f6565;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    C2316.m4362(file3, "Unable to create parent directories of ");
                                    return null;
                                }
                            }
                            c0423.f1528 = this;
                            c0423.f1527 = c3540;
                            C1387 c1387 = this.f6563;
                            c0423.f1529 = c1387;
                            c0423.f1531 = 1;
                            if (c1387.mo2949(c0423) != enumC2282) {
                                interfaceC3087 = c1387;
                                interfaceC5731 = c3540;
                            }
                            return enumC2282;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            c3576 = c0423.f1532;
                            File file4 = (File) c0423.f1529;
                            interfaceC3087 = (InterfaceC3087) c0423.f1527;
                            c1988 = c0423.f1528;
                            try {
                                AbstractC0186.m409(obj);
                                file2 = file4;
                                try {
                                    c3576.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    try {
                                        Files.move(file2.toPath(), c1988.f6565.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                    } catch (IOException unused) {
                                        throw new IOException("Unable to rename " + file2 + " to " + c1988.f6565 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                interfaceC3087.mo2950(null);
                                return C2358.f7817;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    c3576.close();
                                } catch (Throwable th4) {
                                    AbstractC5537.m9223(th, th4);
                                }
                                throw th;
                            }
                        }
                        InterfaceC3087 interfaceC3088 = (InterfaceC3087) c0423.f1529;
                        InterfaceC5731 interfaceC5732 = (InterfaceC5731) c0423.f1527;
                        C1988 c1989 = c0423.f1528;
                        AbstractC0186.m409(obj);
                        interfaceC3087 = interfaceC3088;
                        this = c1989;
                        interfaceC5731 = interfaceC5732;
                        c0423.f1528 = this;
                        c0423.f1527 = interfaceC3087;
                        c0423.f1529 = file;
                        c0423.f1532 = c3575;
                        c0423.f1531 = 2;
                        if (interfaceC5731.mo219(c3575, c0423) != enumC2282) {
                            c1988 = this;
                            file2 = file;
                            c3576 = c3575;
                            c3576.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                Files.move(file2.toPath(), c1988.f6565.toPath(), StandardCopyOption.REPLACE_EXISTING);
                            }
                            interfaceC3087.mo2950(null);
                            return C2358.f7817;
                        }
                        return enumC2282;
                    } catch (Throwable th5) {
                        th = th5;
                        c3576 = c3575;
                        c3576.close();
                        throw th;
                    }
                    c3575 = new C3575(file, this.f6564);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.f6565.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                interfaceC3087.mo2950(null);
                throw th6;
            }
        } catch (IOException e2) {
            e = e2;
            file = c3540;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008c */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:58:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3891(p000.C2476 r8, p000.AbstractC0772 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p000.C1201
            if (r0 == 0) goto L13
            r0 = r9
            ۥْؒ۠ۖ r0 = (p000.C1201) r0
            int r1 = r0.f4139
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4139 = r1
            goto L18
        L13:
            ۥْؒ۠ۖ r0 = new ۥْؒ۠ۖ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f4140
            int r1 = r0.f4139
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            boolean r7 = r0.f4138
            ۥٟؑۘؗ r8 = r0.f4136
            ۥٟؑۚٓ r0 = r0.f4137
            p000.AbstractC0186.m409(r9)     // Catch: java.lang.Throwable -> L2c
            goto L6b
        L2c:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r0
            r0 = r6
            goto L83
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r7)
            return r3
        L38:
            p000.AbstractC0186.m409(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f6562
            boolean r9 = r9.get()
            if (r9 != 0) goto L95
            ۥٕؒٞۡ r9 = r7.f6563
            boolean r9 = r9.m2951()
            ۥٟؑۘؗ r1 = new ۥٟؑۘؗ     // Catch: java.lang.Throwable -> L8c
            java.io.File r4 = r7.f6565     // Catch: java.lang.Throwable -> L8c
            ۥَٕؓٔ r5 = r7.f6564     // Catch: java.lang.Throwable -> L8c
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L80
            r0.f4137 = r7     // Catch: java.lang.Throwable -> L80
            r0.f4136 = r1     // Catch: java.lang.Throwable -> L80
            r0.f4138 = r9     // Catch: java.lang.Throwable -> L80
            r0.f4139 = r2     // Catch: java.lang.Throwable -> L80
            java.lang.Object r8 = r8.mo1173(r1, r4, r0)     // Catch: java.lang.Throwable -> L80
            ۥٟۚؕۨ r0 = p000.EnumC2282.f7590
            if (r8 != r0) goto L67
            return r0
        L67:
            r0 = r7
            r7 = r9
            r9 = r8
            r8 = r1
        L6b:
            r8.close()     // Catch: java.lang.Throwable -> L70
            r8 = r3
            goto L71
        L70:
            r8 = move-exception
        L71:
            if (r8 != 0) goto L7b
            if (r7 == 0) goto L7a
            ۥٕؒٞۡ r7 = r0.f6563
            r7.mo2950(r3)
        L7a:
            return r9
        L7b:
            throw r8     // Catch: java.lang.Throwable -> L7c
        L7c:
            r8 = move-exception
            r9 = r7
            r7 = r0
            goto L8d
        L80:
            r8 = move-exception
            r0 = r8
            r8 = r1
        L83:
            r8.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r8 = move-exception
            p000.AbstractC5537.m9223(r0, r8)     // Catch: java.lang.Throwable -> L8c
        L8b:
            throw r0     // Catch: java.lang.Throwable -> L8c
        L8c:
            r8 = move-exception
        L8d:
            if (r9 == 0) goto L94
            ۥٕؒٞۡ r7 = r7.f6563
            r7.mo2950(r3)
        L94:
            throw r8
        L95:
            java.lang.String r7 = "StorageConnection has already been disposed."
            p000.C1078.m2276(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1988.m3891(ۥْ۟ؗ, ۥؚؒۥؔ):java.lang.Object");
    }
}
