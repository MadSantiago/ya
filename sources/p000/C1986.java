package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥٟؑۘؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1986 implements InterfaceC1508 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AtomicBoolean f6554 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0999 f6555;

    /* JADX INFO: renamed from: ۥۣ */
    public final File f6556;

    public C1986(File file, InterfaceC0999 interfaceC0999) {
        this.f6556 = file;
        this.f6555 = interfaceC0999;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [ۥٟؑۘؗ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, ۥٟؑۘؗ] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [ۥٟؑۘؗ] */
    /* JADX INFO: renamed from: ۥۣ */
    public static Object m3889(C1986 c1986, AbstractC0772 abstractC0772) {
        C0236 c0236;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (abstractC0772 instanceof C0236) {
            c0236 = (C0236) abstractC0772;
            int i = c0236.f887;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0236.f887 = i - Integer.MIN_VALUE;
            } else {
                c0236 = new C0236(c1986, abstractC0772);
            }
        } else {
            c0236 = new C0236(c1986, abstractC0772);
        }
        Object obj = c0236.f885;
        ?? r1 = c0236.f887;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    fileInputStream = c0236.f883;
                    r1 = (C1986) c0236.f884;
                    try {
                        AbstractC0186.m409(obj);
                        AbstractC4554.m7932(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            AbstractC4554.m7932(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r1 != 2) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) c0236.f884;
                try {
                    AbstractC0186.m409(obj);
                    AbstractC4554.m7932(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        AbstractC4554.m7932(closeable, th);
                        throw th6;
                    }
                }
            }
            AbstractC0186.m409(obj);
            if (c1986.f6554.get()) {
                C1078.m2276("This scope has already been closed.");
                return null;
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(c1986.f6556);
                try {
                    InterfaceC0999 interfaceC0999 = c1986.f6555;
                    c0236.f884 = c1986;
                    c0236.f883 = fileInputStream2;
                    c0236.f887 = 1;
                    Object objMo2181 = interfaceC0999.mo2181(fileInputStream2);
                    if (objMo2181 != enumC2282) {
                        fileInputStream = fileInputStream2;
                        obj = objMo2181;
                        AbstractC4554.m7932(fileInputStream, null);
                        return obj;
                    }
                    return enumC2282;
                } catch (Throwable th7) {
                    r1 = c1986;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                File file = c1986.f6556;
                InterfaceC0999 interfaceC09910 = c1986.f6555;
                if (!file.exists()) {
                    return interfaceC09910.mo2179();
                }
                FileInputStream fileInputStream3 = new FileInputStream(c1986.f6556);
                try {
                    c0236.f884 = fileInputStream3;
                    c0236.f883 = null;
                    c0236.f887 = 2;
                    Object objMo2182 = interfaceC09910.mo2181(fileInputStream3);
                    if (objMo2182 != enumC2282) {
                        obj = objMo2182;
                        closeable = fileInputStream3;
                        AbstractC4554.m7932(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            c1986 = r1;
        }
    }

    @Override // p000.InterfaceC1508
    public final void close() {
        this.f6554.set(true);
    }
}
