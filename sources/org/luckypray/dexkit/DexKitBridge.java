package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.AbstractC3872;
import p000.C0035;
import p000.C1206;
import p000.C2351;
import p000.C3133;
import p000.C3728;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final ReentrantReadWriteLock f366 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۦۨ */
    public volatile long f367;

    public DexKitBridge(String str) {
        this.f367 = nativeInitDexKit(str);
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long j, byte[] bArr);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long j, byte[] bArr);

    private static final native void nativeExportDexFile(long j, String str);

    private static final native byte[] nativeFieldGetMethods(long j, long j2);

    private static final native byte[] nativeFieldPutMethods(long j, long j2);

    private static final native byte[] nativeFindClass(long j, byte[] bArr);

    private static final native byte[] nativeFindField(long j, byte[] bArr);

    private static final native byte[] nativeFindMethod(long j, byte[] bArr);

    private static final native byte[] nativeGetCallMethods(long j, long j2);

    private static final native byte[] nativeGetClassAnnotations(long j, long j2);

    private static final native byte[] nativeGetClassByIds(long j, long[] jArr);

    private static final native byte[] nativeGetClassData(long j, String str);

    private static final native int nativeGetDexNum(long j);

    private static final native byte[] nativeGetFieldAnnotations(long j, long j2);

    private static final native byte[] nativeGetFieldByIds(long j, long[] jArr);

    private static final native byte[] nativeGetFieldData(long j, String str);

    private static final native byte[] nativeGetInvokeMethods(long j, long j2);

    private static final native byte[] nativeGetMethodAnnotations(long j, long j2);

    private static final native byte[] nativeGetMethodByIds(long j, long[] jArr);

    private static final native byte[] nativeGetMethodData(long j, String str);

    private static final native int[] nativeGetMethodOpCodes(long j, long j2);

    private static final native byte[] nativeGetMethodUsingFields(long j, long j2);

    private static final native String[] nativeGetMethodUsingStrings(long j, long j2);

    private static final native byte[] nativeGetParameterAnnotations(long j, long j2);

    private static final native String[] nativeGetParameterNames(long j, long j2);

    private static final native long nativeInitDexKit(String str);

    private static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    private static final native void nativeInitFullCache(long j);

    private static final native void nativeRelease(long j);

    private static final native void nativeSetMaxConcurrentQueries(long j, int i);

    private static final native void nativeSetThreadNum(long j, int i);

    /* JADX INFO: renamed from: ۥۣ */
    public static final byte[] m157(long j, byte[] bArr) {
        return nativeBatchFindMethodUsingStrings(j, bArr);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final byte[] m158(long j, byte[] bArr) {
        return nativeFindMethod(j, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f366;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.f367;
            if (j == 0) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            this.f367 = 0L;
            nativeRelease(j);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void finalize() {
        close();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final C3728 m159(long[] jArr) {
        ReentrantReadWriteLock.ReadLock lock = this.f366.readLock();
        lock.lock();
        try {
            long j = this.f367;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeGetClassByIds = nativeGetClassByIds(j, jArr);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
            C0035 c0035 = new C0035();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0035.m4028(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C3728 c3728 = new C3728();
            int iM4031 = c0035.m4031(4);
            int iM4030 = iM4031 != 0 ? c0035.m4030(iM4031) : 0;
            for (int i = 0; i < iM4030; i++) {
                c3728.add(C3133.m5781(this, c0035.m4034(i)));
            }
            return c3728;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C3728 m160(C2351 c2351) {
        byte[] bArrM8228 = c2351.m8228();
        ReentrantReadWriteLock.ReadLock lock = this.f366.readLock();
        lock.lock();
        try {
            long j = this.f367;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindClass = nativeFindClass(j, bArrM8228);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
            C0035 c0035 = new C0035();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0035.m4028(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C3728 c3728 = new C3728();
            int iM4031 = c0035.m4031(4);
            int iM4030 = iM4031 != 0 ? c0035.m4030(iM4031) : 0;
            for (int i = 0; i < iM4030; i++) {
                c3728.add(C3133.m5781(this, c0035.m4034(i)));
            }
            if (c3728.size() > 1) {
                AbstractC3872.m6902(c3728, new C1206(10));
            }
            return c3728;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
