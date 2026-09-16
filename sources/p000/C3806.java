package p000;

import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: ۦٍؘؗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3806 extends AbstractC1333 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ int f12632 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f12633;

    public C3806(File file) {
        super(file.getAbsolutePath());
        this.f12633 = AbstractC5537.m9260(getPath());
    }

    @Override // java.io.File
    public final boolean canExecute() {
        return m6802("[ -x @@ ]");
    }

    @Override // java.io.File
    public final boolean canRead() {
        return m6802("[ -r @@ ]");
    }

    @Override // java.io.File
    public final boolean canWrite() {
        return m6802("[ -w @@ ]");
    }

    @Override // java.io.File
    public final boolean createNewFile() {
        return m6802("[ ! -e @@ ] && echo -n > @@");
    }

    @Override // java.io.File
    public final boolean delete() {
        return m6802("rm -f @@ || rmdir -f @@");
    }

    @Override // java.io.File
    public final void deleteOnExit() {
        throw new UnsupportedOperationException("Unsupported SuFile operation");
    }

    @Override // java.io.File
    public final boolean exists() {
        return m6802("[ -e @@ ]");
    }

    @Override // java.io.File
    public final String getAbsolutePath() {
        return getPath();
    }

    @Override // java.io.File
    public final File getCanonicalFile() {
        return new C3806(getCanonicalPath());
    }

    @Override // java.io.File
    public final String getCanonicalPath() {
        String strM6805 = m6805("readlink -f @@");
        return strM6805.isEmpty() ? getPath() : strM6805;
    }

    @Override // java.io.File
    public final long getFreeSpace() {
        return m6807("%f");
    }

    @Override // java.io.File
    public final File getParentFile() {
        String parent = getParent();
        if (parent == null) {
            return null;
        }
        return new C3806(parent);
    }

    @Override // java.io.File
    public final long getTotalSpace() {
        return m6807("%b");
    }

    @Override // java.io.File
    public final long getUsableSpace() {
        return m6807("%a");
    }

    @Override // java.io.File
    public final boolean isDirectory() {
        return m6802("[ -d @@ ]");
    }

    @Override // java.io.File
    public final boolean isFile() {
        return m6802("[ -f @@ ]");
    }

    @Override // java.io.File
    public final long lastModified() {
        try {
            return Long.parseLong(m6805("stat -c '%Y' @@")) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final long length() {
        try {
            return Long.parseLong(m6805("stat -c '%s' @@"));
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final String[] list(FilenameFilter filenameFilter) {
        if (!m6802("[ -d @@ ]")) {
            return null;
        }
        String str = "ls -a " + this.f12633;
        ExecutorService executorService = C3267.f10970;
        C4432 c4432 = new C4432(AbstractC2552.m4818());
        c4432.m7724(str);
        c4432.f14611 = new LinkedList();
        c4432.f14608 = null;
        List list = c4432.m7727().f3293;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String str2 = (String) listIterator.next();
            if (str2.equals(".") || str2.equals("..") || (filenameFilter != null && !filenameFilter.accept(this, str2))) {
                listIterator.remove();
            }
        }
        return (String[]) list.toArray(new String[0]);
    }

    @Override // java.io.File
    public final File[] listFiles(FileFilter fileFilter) {
        String[] list = list(null);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C3806 c3806M6806 = m6806(str);
            if (fileFilter == null || fileFilter.accept(c3806M6806)) {
                arrayList.add(c3806M6806);
            }
        }
        return (C3806[]) arrayList.toArray(new C3806[0]);
    }

    @Override // java.io.File
    public final boolean mkdir() {
        return m6802("mkdir @@");
    }

    @Override // java.io.File
    public final boolean mkdirs() {
        return m6802("mkdir -p @@");
    }

    @Override // java.io.File
    public final boolean renameTo(File file) {
        String str = "mv -f " + this.f12633 + " " + AbstractC5537.m9260(file.getAbsolutePath());
        ExecutorService executorService = C3267.f10970;
        C4432 c4432 = new C4432(AbstractC2552.m4818());
        c4432.m7724(str);
        c4432.f14611 = null;
        c4432.f14608 = C4432.f14607;
        return c4432.m7727().f3292 == 0;
    }

    @Override // java.io.File
    public final boolean setExecutable(boolean z, boolean z2) {
        return m6804(1, z, z2);
    }

    @Override // java.io.File
    public final boolean setLastModified(long j) {
        return m6802("[ -e @@ ] && touch -t " + new SimpleDateFormat("yyyyMMddHHmm", Locale.US).format(new Date(j)) + " @@");
    }

    @Override // java.io.File
    public final boolean setReadOnly() {
        return m6804(2, false, false) && m6804(1, false, false);
    }

    @Override // java.io.File
    public final boolean setReadable(boolean z, boolean z2) {
        return m6804(4, z, z2);
    }

    @Override // java.io.File
    public final boolean setWritable(boolean z, boolean z2) {
        return m6804(2, z, z2);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m6802(String str) {
        ExecutorService executorService = C3267.f10970;
        C3267 c3267M4818 = AbstractC2552.m4818();
        String[] strArr = {str.replace("@@", this.f12633)};
        C4432 c4432 = new C4432(c3267M4818);
        c4432.m7724(strArr);
        c4432.f14611 = null;
        c4432.f14608 = C4432.f14607;
        return c4432.m7727().f3292 == 0;
    }

    @Override // p000.AbstractC1333
    /* JADX INFO: renamed from: ۥُ, reason: merged with bridge method [inline-methods] */
    public final C3806[] listFiles() {
        String[] list;
        if (!m6802("[ -d @@ ]") || (list = list(null)) == null) {
            return null;
        }
        int length = list.length;
        C3806[] c3806Arr = new C3806[length];
        for (int i = 0; i < length; i++) {
            c3806Arr[i] = m6806(list[i]);
        }
        return c3806Arr;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m6804(int i, boolean z, boolean z2) {
        char[] charArray = m6805("stat -c '%a' @@").toCharArray();
        int i2 = 0;
        if (charArray.length != 3) {
            return false;
        }
        while (i2 < 3) {
            int i3 = charArray[i2] - '0';
            charArray[i2] = (char) (((!z || (z2 && i2 != 0)) ? i3 & (~i) : i3 | i) + 48);
            i2++;
        }
        return m6802("chmod " + new String(charArray) + " @@");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final String m6805(String str) {
        ExecutorService executorService = C3267.f10970;
        C3267 c3267M4818 = AbstractC2552.m4818();
        String[] strArr = {str.replace("@@", this.f12633)};
        C4432 c4432 = new C4432(c3267M4818);
        c4432.m7724(strArr);
        c4432.f14611 = new ArrayList();
        c4432.f14608 = null;
        List list = c4432.m7727().f3293;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        if (list == null || list.size() == 0) {
            return "";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!TextUtils.isEmpty((String) it.next())) {
                return (String) list.get(list.size() - 1);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C3806 m6806(String str) {
        return new C3806(new File(getPath(), str));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final long m6807(String str) {
        String[] strArrSplit = m6805("stat -fc '%S " + str + "' @@").split(" ");
        if (strArrSplit.length != 2) {
            return Long.MAX_VALUE;
        }
        try {
            return Long.parseLong(strArrSplit[0]) * Long.parseLong(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return Long.MAX_VALUE;
        }
    }

    public C3806(String str) {
        this(new File(str));
    }

    @Override // java.io.File
    public final File getAbsoluteFile() {
        return this;
    }

    @Override // java.io.File
    public final File[] listFiles(FilenameFilter filenameFilter) {
        String[] list;
        if (!m6802("[ -d @@ ]") || (list = list(filenameFilter)) == null) {
            return null;
        }
        int length = list.length;
        C3806[] c3806Arr = new C3806[length];
        for (int i = 0; i < length; i++) {
            c3806Arr[i] = m6806(list[i]);
        }
        return c3806Arr;
    }

    @Override // java.io.File
    public final String[] list() {
        return list(null);
    }
}
