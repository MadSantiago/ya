package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: ۦْۚؒٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5155 implements InterfaceC5823 {

    /* JADX INFO: renamed from: ۦِ */
    public static final C4992 f17070 = new C4992(18);

    /* JADX INFO: renamed from: ۥؗ */
    public final C1083 f17071;

    /* JADX INFO: renamed from: ۥُ */
    public final String f17072;

    /* JADX INFO: renamed from: ۥّ */
    public final String f17073;

    /* JADX INFO: renamed from: ۥۗ */
    public final File f17074;

    /* JADX INFO: renamed from: ۥۜ */
    public final C2432 f17075;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3534 f17076;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f17077;

    /* JADX INFO: renamed from: ۦٛ */
    public final C2432 f17078;

    /* JADX INFO: renamed from: ۦۙ */
    public final C1387 f17079;

    public C5155(InterfaceC3534 interfaceC3534, File file) {
        this.f17076 = interfaceC3534;
        this.f17074 = file;
        Object obj = FileObserverC1615.f5421;
        this.f17071 = new C1083(new C0061(file, (InterfaceC0443) null, 23), C4794.f15814, -2, 1, 0);
        this.f17077 = ".lock";
        this.f17072 = ".version";
        this.f17073 = "fcntl failed: EAGAIN";
        this.f17079 = new C1387();
        this.f17075 = new C2432(new C3430(this, 1));
        this.f17078 = new C2432(new C3430(this, 0));
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m8752(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                C2316.m4362(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo5823(C3540 c3540) {
        C2432 c2432 = this.f17078;
        if (c2432.m4545()) {
            return new Integer(C4138.f13769.nativeIncrementAndGetCounterValue(((C4138) c2432.getValue()).f13770));
        }
        return AbstractC2765.m5144(this.f17076, new C0910(this, null, 1), c3540);
    }

    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4707 mo5824() {
        return this.f17071;
    }

    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo5825(AbstractC0772 abstractC0772) {
        C2432 c2432 = this.f17078;
        if (c2432.m4545()) {
            return new Integer(C4138.f13769.nativeGetCounterValue(((C4138) c2432.getValue()).f13770));
        }
        return AbstractC2765.m5144(this.f17076, new C0910(this, null, 0), abstractC0772);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:41:0x00bb, B:55:0x00d9, B:56:0x00dc), top: B:77:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:41:0x00bb, B:55:0x00d9, B:56:0x00dc), top: B:77:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ۦٌُٝؔ] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, ۦٌُٝؔ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo5826(InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) throws Throwable {
        C3918 c3918;
        C1387 c1387;
        ?? r9;
        FileOutputStream fileOutputStream;
        Throwable th;
        ?? r10;
        ?? r8;
        ?? r1;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objMo211;
        ?? r0;
        ?? r11;
        if (abstractC0772 instanceof C3918) {
            c3918 = (C3918) abstractC0772;
            int i = c3918.f13062;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3918.f13062 = i - Integer.MIN_VALUE;
            } else {
                c3918 = new C3918(this, abstractC0772);
            }
        } else {
            c3918 = new C3918(this, abstractC0772);
        }
        ?? r12 = c3918.f13063;
        int i2 = c3918.f13062;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            try {
                try {
                    if (i2 == 0) {
                        AbstractC0186.m409(r12);
                        c3918.f13060 = this;
                        c3918.f13059 = interfaceC4745;
                        c1387 = this.f17079;
                        c3918.f13061 = c1387;
                        c3918.f13062 = 1;
                        if (c1387.mo2949(c3918) != enumC2282) {
                        }
                        r9 = interfaceC4745;
                        r12 = c1387;
                        return enumC2282;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) c3918.f13061;
                            closeable = (Closeable) c3918.f13059;
                            InterfaceC3087 interfaceC3087 = (InterfaceC3087) c3918.f13060;
                            try {
                                AbstractC0186.m409(r12);
                                r0 = interfaceC3087;
                                r11 = r12;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    AbstractC4554.m7932(closeable, null);
                                    r0.mo2950(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = r0;
                                    r12.mo2950(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) c3918.f13061;
                        r8 = (InterfaceC3087) c3918.f13059;
                        InterfaceC4745 interfaceC4746 = (InterfaceC4745) c3918.f13060;
                        try {
                            AbstractC0186.m409(r12);
                            r1 = interfaceC4746;
                            r8 = r8;
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                c3918.f13060 = r8;
                                c3918.f13059 = closeable;
                                c3918.f13061 = fileLock2;
                                c3918.f13062 = 3;
                                objMo211 = r1.mo211(c3918);
                                if (objMo211 != enumC2282) {
                                    r0 = r8;
                                    fileLock = fileLock2;
                                    r11 = objMo211;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    AbstractC4554.m7932(closeable, null);
                                    r0.mo2950(null);
                                    return r11;
                                }
                                r9 = interfaceC4745;
                                r12 = c1387;
                                return enumC2282;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    InterfaceC3087 interfaceC3088 = (InterfaceC3087) c3918.f13061;
                    InterfaceC4745 interfaceC4747 = (InterfaceC4745) c3918.f13059;
                    C5155 c5155 = (C5155) c3918.f13060;
                    AbstractC0186.m409(r12);
                    r12 = interfaceC3088;
                    this = c5155;
                    r9 = interfaceC4747;
                    C4992 c4992 = f17070;
                    c3918.f13060 = r9;
                    c3918.f13059 = r12;
                    c3918.f13061 = fileOutputStream;
                    c3918.f13062 = 2;
                    Object objM8384 = c4992.m8384(fileOutputStream, c3918);
                    if (objM8384 != enumC2282) {
                        ?? r7 = r12;
                        r10 = objM8384;
                        r8 = r7;
                        r1 = r9;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r10;
                        c3918.f13060 = r8;
                        c3918.f13059 = closeable;
                        c3918.f13061 = fileLock2;
                        c3918.f13062 = 3;
                        objMo211 = r1.mo211(c3918);
                        if (objMo211 != enumC2282) {
                            r0 = r8;
                            fileLock = fileLock2;
                            r11 = objMo211;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            AbstractC4554.m7932(closeable, null);
                            r0.mo2950(null);
                            return r11;
                        }
                    }
                    r9 = interfaceC4745;
                    r12 = c1387;
                    return enumC2282;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                r9 = interfaceC4745;
                r12 = c1387;
                fileOutputStream = new FileOutputStream((File) this.f17075.getValue());
            } catch (Throwable th7) {
                th = th7;
                r12.mo2950(null);
                throw th;
            }
        } catch (Throwable th8) {
            r12 = c3918;
            try {
                throw th8;
            } catch (Throwable th9) {
                AbstractC4554.m7932(interfaceC4745, th8);
                throw th9;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00db A[Catch: all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x00df, blocks: (B:60:0x00db, B:74:0x00f6, B:75:0x00f9), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f6 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #9 {all -> 0x00df, blocks: (B:60:0x00db, B:74:0x00f6, B:75:0x00f9), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [ۦۦؙؑؑ] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ۥٕؒٞۡ] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ۥّٚؗۙ] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo5827(InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) throws Throwable {
        ?? c1746;
        ?? r1;
        ?? r2;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        FileInputStream fileInputStream;
        ?? r3;
        ?? r4;
        if (abstractC0772 instanceof C1746) {
            C1746 c1747 = (C1746) abstractC0772;
            int i = c1747.f5812;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1747.f5812 = i - Integer.MIN_VALUE;
                c1746 = c1747;
            } else {
                c1746 = new C1746(this, abstractC0772);
            }
        } else {
            c1746 = new C1746(this, abstractC0772);
        }
        Object objMo219 = c1746.f5814;
        ?? r5 = c1746.f5812;
        try {
            if (r5 == 0) {
                AbstractC0186.m409(objMo219);
                C1387 c1387 = this.f17079;
                boolean zM2951 = c1387.m2951();
                EnumC2282 enumC2282 = EnumC2282.f7590;
                try {
                    if (zM2951) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.f17075.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e) {
                                String message2 = e.getMessage();
                                if ((message2 == null || !message2.startsWith(this.f17073)) && ((message = e.getMessage()) == null || !message.startsWith("Resource deadlock would occur"))) {
                                    throw e;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                c1746.f5809 = c1387;
                                c1746.f5808 = fileInputStream2;
                                c1746.f5810 = fileLockTryLock;
                                c1746.f5813 = zM2951;
                                c1746.f5812 = 2;
                                objMo219 = interfaceC5731.mo219(boolValueOf, c1746);
                                if (objMo219 != enumC2282) {
                                    fileLock = fileLockTryLock;
                                    c1746 = c1387;
                                    r1 = zM2951;
                                    fileInputStream = fileInputStream2;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    AbstractC4554.m7932(fileInputStream, null);
                                    if (r1 != 0) {
                                        c1746.mo2950(null);
                                    }
                                    return objMo219;
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        c1746.f5809 = c1387;
                        c1746.f5813 = zM2951;
                        c1746.f5812 = 1;
                        objMo219 = interfaceC5731.mo219(bool, c1746);
                        if (objMo219 != enumC2282) {
                            r3 = c1387;
                            r4 = zM2951;
                            if (r4 != 0) {
                                r3.mo2950(null);
                            }
                            return objMo219;
                        }
                    }
                    return enumC2282;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = c1387;
                    r1 = zM2951;
                }
            } else if (r5 == 1) {
                r1 = c1746.f5813;
                r2 = c1746.f5809;
                try {
                    AbstractC0186.m409(objMo219);
                    r4 = r1;
                    r3 = r2;
                    if (r4 != 0) {
                        r3.mo2950(null);
                    }
                    return objMo219;
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (r5 != 2) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = c1746.f5813;
                fileLock = c1746.f5810;
                fileInputStream = c1746.f5808;
                C1387 c1388 = c1746.f5809;
                try {
                    AbstractC0186.m409(objMo219);
                    r1 = z;
                    c1746 = c1388;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        AbstractC4554.m7932(fileInputStream, null);
                        if (r1 != 0) {
                            c1746.mo2950(null);
                        }
                        return objMo219;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    AbstractC4554.m7932(r5, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                }
            }
        }
        r2 = c1746;
        if (r1 != 0) {
            r2.mo2950(null);
        }
        throw th;
    }
}
