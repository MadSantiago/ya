package p000;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Int64Ref;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.util.MutableLong;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;

/* JADX INFO: renamed from: ۥۡؑۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2540 implements Closeable {

    /* JADX INFO: renamed from: ۥَ */
    public StructStat f8464;

    /* JADX INFO: renamed from: ۥْ */
    public FileDescriptor f8465;

    /* JADX INFO: renamed from: ۥٓ */
    public ByteBuffer f8466;

    /* JADX INFO: renamed from: ۦ۟ */
    public FileDescriptor f8467;

    /* JADX INFO: renamed from: ۦۨ */
    public FileDescriptor f8468;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        FileDescriptor fileDescriptor = this.f8468;
        if (fileDescriptor != null) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException unused) {
            }
            this.f8468 = null;
        }
        FileDescriptor fileDescriptor2 = this.f8467;
        if (fileDescriptor2 != null) {
            try {
                Os.close(fileDescriptor2);
            } catch (ErrnoException unused2) {
            }
            this.f8467 = null;
        }
        FileDescriptor fileDescriptor3 = this.f8465;
        if (fileDescriptor3 != null) {
            try {
                Os.close(fileDescriptor3);
            } catch (ErrnoException unused3) {
            }
            this.f8465 = null;
        }
    }

    public final synchronized long size() {
        long jLseek;
        FileDescriptor fileDescriptor = this.f8468;
        if (fileDescriptor == null) {
            throw new ClosedChannelException();
        }
        int i = OsConstants.SEEK_CUR;
        long jLseek2 = Os.lseek(fileDescriptor, 0L, i);
        Os.lseek(this.f8468, 0L, OsConstants.SEEK_END);
        jLseek = Os.lseek(this.f8468, 0L, i);
        Os.lseek(this.f8468, jLseek2, OsConstants.SEEK_SET);
        return jLseek;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final synchronized int m4767(int i, long j, boolean z) {
        int i2;
        Int64Ref int64RefM9303;
        if (this.f8468 == null || this.f8467 == null) {
            throw new ClosedChannelException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (j < 0) {
                int64RefM9303 = null;
            } else {
                AbstractC5550.m9295();
                int64RefM9303 = AbstractC5550.m9303(j);
            }
            Int64Ref int64Ref = int64RefM9303;
            if (!z) {
                return (int) AbstractC2611.m4940(this.f8467, null, this.f8468, int64Ref, i);
            }
            int iM4940 = i;
            while (iM4940 > 0) {
                long j2 = iM4940;
                iM4940 = (int) (j2 - AbstractC2611.m4940(this.f8467, null, this.f8468, int64Ref, j2));
            }
            return i;
        }
        ByteBuffer byteBufferAllocateDirect = this.f8466;
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(65536);
            this.f8466 = byteBufferAllocateDirect;
        }
        byteBufferAllocateDirect.clear();
        ByteBuffer byteBuffer = this.f8466;
        byteBuffer.limit(i);
        if (z) {
            i2 = 0;
            while (i > i2) {
                i2 += Os.read(this.f8467, byteBuffer);
            }
        } else {
            i2 = Os.read(this.f8467, byteBuffer);
        }
        byteBuffer.flip();
        int iWrite = i2;
        while (iWrite > 0) {
            FileDescriptor fileDescriptor = this.f8468;
            if (j < 0) {
                iWrite -= Os.write(fileDescriptor, byteBuffer);
            } else {
                int iPwrite = Os.pwrite(fileDescriptor, byteBuffer, j);
                iWrite -= iPwrite;
                j += (long) iPwrite;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized int m4768(long j, int i) {
        long jM4926;
        try {
            FileDescriptor fileDescriptor = this.f8468;
            if (fileDescriptor == null || this.f8465 == null) {
                throw new ClosedChannelException();
            }
            MutableLong mutableLong = null;
            Int64Ref int64RefM9303 = null;
            if (Build.VERSION.SDK_INT >= 28) {
                if (j >= 0) {
                    AbstractC5550.m9295();
                    int64RefM9303 = AbstractC5550.m9303(j);
                }
                jM4926 = AbstractC2611.m4940(this.f8468, int64RefM9303, this.f8465, null, i);
            } else {
                StructStat structStatFstat = this.f8464;
                if (structStatFstat == null) {
                    structStatFstat = Os.fstat(fileDescriptor);
                    this.f8464 = structStatFstat;
                }
                if (OsConstants.S_ISREG(structStatFstat.st_mode) || OsConstants.S_ISBLK(structStatFstat.st_mode)) {
                    if (j >= 0) {
                        mutableLong = new MutableLong(j);
                    }
                    jM4926 = AbstractC2611.m4926(this.f8465, this.f8468, mutableLong, i);
                } else {
                    ByteBuffer byteBufferAllocateDirect = this.f8466;
                    if (byteBufferAllocateDirect == null) {
                        byteBufferAllocateDirect = ByteBuffer.allocateDirect(65536);
                        this.f8466 = byteBufferAllocateDirect;
                    }
                    byteBufferAllocateDirect.clear();
                    ByteBuffer byteBuffer = this.f8466;
                    byteBuffer.limit(Math.min(i, byteBuffer.capacity()));
                    FileDescriptor fileDescriptor2 = this.f8468;
                    if (j < 0) {
                        Os.read(fileDescriptor2, byteBuffer);
                    } else {
                        Os.pread(fileDescriptor2, byteBuffer, j);
                    }
                    byteBuffer.flip();
                    jM4926 = byteBuffer.remaining();
                    int iWrite = (int) jM4926;
                    while (iWrite > 0) {
                        iWrite -= Os.write(this.f8465, byteBuffer);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (int) jM4926;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final synchronized void m4769(boolean z) {
        try {
            FileDescriptor fileDescriptor = this.f8468;
            if (fileDescriptor == null) {
                throw new ClosedChannelException();
            }
            if (z) {
                Os.fsync(fileDescriptor);
            } else {
                Os.fdatasync(fileDescriptor);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
