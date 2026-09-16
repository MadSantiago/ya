package p000;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: ۦٜٔؗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4200 {
    /* JADX INFO: renamed from: ۥؗ */
    public static long m7422(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static FileDescriptor m7423(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m7424(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }
}
