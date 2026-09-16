package p000;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ۦؗؕۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3430 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5155 f11394;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f11395;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3430(C5155 c5155, int i) {
        super(0);
        this.f11395 = i;
        this.f11394 = c5155;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        int i = this.f11395;
        C5155 c5155 = this.f11394;
        switch (i) {
            case 0:
                System.loadLibrary("datastore_shared_counter");
                File file = new File(c5155.f17074.getAbsolutePath() + c5155.f17072);
                C5155.m8752(file);
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 939524096);
                    try {
                        int fd = parcelFileDescriptorOpen.getFd();
                        NativeSharedCounter nativeSharedCounter = C4138.f13769;
                        if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                        if (jNativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        C4138 c4138 = new C4138(jNativeCreateSharedCounter);
                        parcelFileDescriptorOpen.close();
                        return c4138;
                    } catch (Throwable th) {
                        th = th;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptorOpen = null;
                }
                break;
            default:
                File file2 = new File(c5155.f17074.getAbsolutePath() + c5155.f17077);
                C5155.m8752(file2);
                return file2;
        }
    }
}
