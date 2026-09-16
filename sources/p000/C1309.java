package p000;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ۥٔؑٚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1309 implements InterfaceC1008 {
    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2216(Uri uri) throws IOException {
        File fileM2163 = AbstractC0993.m2163(uri);
        if (fileM2163.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileM2163.delete()) {
            return;
        }
        if (!fileM2163.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۥّ */
    public final String mo2217() {
        return "file";
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۥۗ */
    public final OutputStream mo2218(Uri uri) throws IOException {
        File fileM2163 = AbstractC0993.m2163(uri);
        AbstractC3933.m7075(fileM2163);
        return new C3493(new FileOutputStream(fileM2163), fileM2163);
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۥۣ */
    public final C0691 mo2219(Uri uri) throws C2943 {
        File fileM2163 = AbstractC0993.m2163(uri);
        return new C0691(new FileInputStream(fileM2163), fileM2163);
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2220(Uri uri, Uri uri2) throws IOException {
        File fileM2163 = AbstractC0993.m2163(uri);
        File fileM2164 = AbstractC0993.m2163(uri2);
        AbstractC3933.m7075(fileM2164);
        if (!fileM2163.renameTo(fileM2164)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
