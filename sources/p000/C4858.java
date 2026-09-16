package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٍٟؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4858 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f15982 = new Object();

    /* JADX INFO: renamed from: ۥۗ */
    public final C1309 f15983 = new C1309();

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f15984;

    /* JADX INFO: renamed from: ۦؑ */
    public String f15985;

    public C4858(C0272 c0272) {
        this.f15984 = c0272.f972;
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2216(Uri uri) throws IOException {
        this.f15983.mo2216(m8221(uri));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:57:0x0118, B:59:0x011c, B:62:0x0131), top: B:84:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۥُ */
    public final Uri m8221(Uri uri) throws IOException {
        File externalFilesDir;
        Account account;
        String absolutePath;
        if (m8222(uri)) {
            throw new C2943("Operation across authorities is not allowed.");
        }
        File file = null;
        if (!m8222(uri)) {
            Context context = this.f15984;
            if (!uri.getScheme().equals("android")) {
                throw new C2943("Scheme must be 'android'");
            }
            if (uri.getPathSegments().isEmpty()) {
                throw new C2943(String.format("Path must start with a valid logical location: %s", uri));
            }
            if (!TextUtils.isEmpty(uri.getQuery())) {
                throw new C2943("Did not expect uri to have query");
            }
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            String str = (String) arrayList.get(0);
            switch (str.hashCode()) {
                case -1820761141:
                    if (str.equals("external")) {
                        externalFilesDir = context.getExternalFilesDir(null);
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!AbstractC0949.m1942(context)) {
                            synchronized (this.f15982) {
                                try {
                                    absolutePath = this.f15985;
                                    if (absolutePath == null) {
                                        absolutePath = AbstractC2133.m4134(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                        this.f15985 = absolutePath;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                throw new C2943("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    throw new C2943(String.format("Path must start with a valid logical location: %s", uri));
                case 94416770:
                    if (str.equals("cache")) {
                        externalFilesDir = context.getCacheDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!AbstractC0949.m1942(context)) {
                            synchronized (this.f15982) {
                                absolutePath = this.f15985;
                                if (absolutePath == null) {
                                    absolutePath = AbstractC2133.m4134(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.f15985 = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new C2943("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new C2943(String.format("Path must start with a valid logical location: %s", uri));
                case 97434231:
                    if (str.equals("files")) {
                        externalFilesDir = AbstractC2133.m4134(context);
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!AbstractC0949.m1942(context)) {
                            synchronized (this.f15982) {
                                absolutePath = this.f15985;
                                if (absolutePath == null) {
                                    absolutePath = AbstractC2133.m4134(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.f15985 = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new C2943("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new C2943(String.format("Path must start with a valid logical location: %s", uri));
                case 835260319:
                    if (str.equals("managed")) {
                        File file2 = new File(AbstractC2133.m4134(context), "managed");
                        if (arrayList.size() >= 3) {
                            try {
                                String str2 = (String) arrayList.get(2);
                                Account account2 = AbstractC3962.f13246;
                                if ("shared".equals(str2)) {
                                    account = AbstractC3962.f13246;
                                } else {
                                    int iIndexOf = str2.indexOf(58);
                                    AbstractC2552.m4830(iIndexOf >= 0, "Malformed account", new Object[0]);
                                    account = new Account(str2.substring(iIndexOf + 1), str2.substring(0, iIndexOf));
                                }
                                if (!AbstractC3962.f13246.equals(account)) {
                                    throw new C2943("AccountManager cannot be null");
                                }
                            } catch (IllegalArgumentException e) {
                                throw new C2943(e);
                            }
                        }
                        externalFilesDir = file2;
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!AbstractC0949.m1942(context)) {
                            synchronized (this.f15982) {
                                absolutePath = this.f15985;
                                if (absolutePath == null) {
                                    absolutePath = AbstractC2133.m4134(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.f15985 = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new C2943("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new C2943(String.format("Path must start with a valid logical location: %s", uri));
                case 988548496:
                    if (str.equals("directboot-cache")) {
                        externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!AbstractC0949.m1942(context)) {
                            synchronized (this.f15982) {
                                absolutePath = this.f15985;
                                if (absolutePath == null) {
                                    absolutePath = AbstractC2133.m4134(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.f15985 = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new C2943("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new C2943(String.format("Path must start with a valid logical location: %s", uri));
                case 991565957:
                    if (str.equals("directboot-files")) {
                        externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                        file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!AbstractC0949.m1942(context)) {
                            synchronized (this.f15982) {
                                absolutePath = this.f15985;
                                if (absolutePath == null) {
                                    absolutePath = AbstractC2133.m4134(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                    this.f15985 = absolutePath;
                                }
                                if (!file.getAbsolutePath().startsWith(absolutePath)) {
                                    throw new C2943("Cannot access credential-protected data from direct boot");
                                }
                            }
                        }
                    }
                    throw new C2943(String.format("Path must start with a valid logical location: %s", uri));
                default:
                    throw new C2943(String.format("Path must start with a valid logical location: %s", uri));
            }
        }
        C5028.m8448("operation is not permitted in other authorities.");
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        C1868 c1868 = AbstractC4822.f15887;
        AbstractC3933.m7099(4, "initialCapacity");
        builderPath.path(file.getAbsolutePath());
        return builderPath.encodedFragment(AbstractC0621.m1387(AbstractC4822.m8197(0, new Object[4]))).build();
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۥّ */
    public final String mo2217() {
        return "android";
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۥۗ */
    public final OutputStream mo2218(Uri uri) {
        return this.f15983.mo2218(m8221(uri));
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۥۣ */
    public final C0691 mo2219(Uri uri) throws C2943 {
        if (m8222(uri)) {
            throw new C2943("Android backend cannot perform remote operations without a remote backend");
        }
        File fileM2163 = AbstractC0993.m2163(m8221(uri));
        return new C0691(new FileInputStream(fileM2163), fileM2163);
    }

    @Override // p000.InterfaceC1008
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2220(Uri uri, Uri uri2) throws IOException {
        this.f15983.mo2220(m8221(uri), m8221(uri2));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m8222(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f15984.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
